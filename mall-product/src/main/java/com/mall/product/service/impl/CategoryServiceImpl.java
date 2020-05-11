package com.mall.product.service.impl;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mall.common.utils.PageUtils;
import com.mall.common.utils.Query;

import com.mall.product.dao.CategoryDao;
import com.mall.product.entity.CategoryEntity;
import com.mall.product.service.CategoryService;


@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CategoryEntity> page = this.page(
                new Query<CategoryEntity>().getPage(params),
                new QueryWrapper<CategoryEntity>()
        );

        return new PageUtils(page);
    }

    @Override
    public List<CategoryEntity> listWithTree() {
        //1.查询所有分类
        List<CategoryEntity> categoryEntityList = baseMapper.selectList(null);
        //2.组装成父子的树形结构


        List<CategoryEntity> level1Menus = categoryEntityList.stream().filter(categoryEntity ->
                categoryEntity.getParentCid() == 0
        ).map(menu->{
            menu.setChildren(getChildrens(menu,categoryEntityList));
            return menu;
        }).sorted((menu1,menu2)->{
            return (menu1.getSort() == null ? 0 : menu1.getSort() ) - (menu2.getSort() == null ? 0 : menu2.getSort());
        }).collect(Collectors.toList());

        return level1Menus;
    }

    //递归查找所有菜单的子菜单
    private List<CategoryEntity> getChildrens(CategoryEntity root,List<CategoryEntity> all){

        List<CategoryEntity> children = all.stream().filter(categoryEntity->{
            return categoryEntity.getParentCid() == root.getCatId();
        }).map(categoryEntity -> {
            //找到子菜单
            categoryEntity.setChildren(getChildrens(categoryEntity,all));
            return categoryEntity;
            //菜单的排序
        }).sorted((menu1,menu2)->{
            return (menu1.getSort() == null ? 0: menu1.getSort() ) - (menu2.getSort() == null ? 0 : menu2.getSort());
        }).collect(Collectors.toList());

        return children;
    }

}
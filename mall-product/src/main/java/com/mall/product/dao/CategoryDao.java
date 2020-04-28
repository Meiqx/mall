package com.mall.product.dao;

import com.mall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author MeiQx
 * @email 1328973336@qq.com
 * @date 2020-04-28 19:08:10
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}

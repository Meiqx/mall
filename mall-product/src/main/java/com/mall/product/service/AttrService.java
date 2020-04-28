package com.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.mall.common.utils.PageUtils;
import com.mall.product.entity.AttrEntity;

import java.util.Map;

/**
 * 商品属性
 *
 * @author MeiQx
 * @email 1328973336@qq.com
 * @date 2020-04-28 19:08:10
 */
public interface AttrService extends IService<AttrEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


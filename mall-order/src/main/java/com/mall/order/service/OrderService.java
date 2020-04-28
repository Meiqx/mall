package com.mall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.mall.common.utils.PageUtils;
import com.mall.order.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author MeiQx
 * @email 1328973336@qq.com
 * @date 2020-04-28 22:38:29
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


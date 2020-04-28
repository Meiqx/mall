package com.mall.order.dao;

import com.mall.order.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 * 
 * @author MeiQx
 * @email 1328973336@qq.com
 * @date 2020-04-28 22:38:29
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {
	
}

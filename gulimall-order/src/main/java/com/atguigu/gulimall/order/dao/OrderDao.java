package com.atguigu.gulimall.order.dao;

import com.atguigu.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author chenchuang
 * @email 0912chenchuang@gmail.com
 * @date 2024-03-19 23:22:44
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}

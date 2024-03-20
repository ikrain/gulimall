package com.atguigu.gulimall.coupon.dao;

import com.atguigu.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author chenchuang
 * @email 0912chenchuang@gmail.com
 * @date 2024-03-19 22:51:35
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}

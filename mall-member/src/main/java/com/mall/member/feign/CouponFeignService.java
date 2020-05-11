package com.mall.member.feign;

import com.mall.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

//一个声明式远程调用服务
@FeignClient("mall-coupon")
public interface CouponFeignService {

    @RequestMapping("coupon/coupon/member/list")
    public R memberCoupons();
}

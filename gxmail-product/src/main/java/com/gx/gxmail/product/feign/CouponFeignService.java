package com.gx.gxmail.product.feign;

import com.gx.common.to.SkuReductionTo;
import com.gx.common.to.SpuBoundTo;
import com.gx.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient("gxmail-coupon")
public interface CouponFeignService {
    @PostMapping("coupon/spubounds/save")
    R saveSpuBounds(@RequestBody SpuBoundTo spuBoundTo);

    @PostMapping("coupon/skufullreduction/saveInfo")
    R saveSkuReduction(SkuReductionTo skuReductionTo);
}

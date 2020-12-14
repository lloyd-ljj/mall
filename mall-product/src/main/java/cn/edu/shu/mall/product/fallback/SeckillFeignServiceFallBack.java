package cn.edu.shu.mall.product.fallback;

import cn.edu.shu.common.exception.BizCodeEnum;
import cn.edu.shu.common.utils.R;
import cn.edu.shu.mall.product.feign.SeckillFeignService;
import org.springframework.stereotype.Component;


@Component
public class SeckillFeignServiceFallBack implements SeckillFeignService {
    @Override
    public R getSkuSeckilInfo(Long skuId) {
        return R.error(BizCodeEnum.TO_MANY_REQUEST.getCode(),BizCodeEnum.TO_MANY_REQUEST.getMsg());
    }
}

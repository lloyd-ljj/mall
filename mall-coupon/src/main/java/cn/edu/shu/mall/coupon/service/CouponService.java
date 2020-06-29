package cn.edu.shu.mall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import cn.edu.shu.common.utils.PageUtils;
import cn.edu.shu.mall.coupon.entity.CouponEntity;

import java.util.Map;

/**
 * 优惠券信息
 *
 * @author lianlianjie
 * @email lloyd@shu.edu.cn
 * @date 2020-05-15 21:03:46
 */
public interface CouponService extends IService<CouponEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


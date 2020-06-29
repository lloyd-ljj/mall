package cn.edu.shu.mall.coupon.dao;

import cn.edu.shu.mall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author lianlianjie
 * @email lloyd@shu.edu.cn
 * @date 2020-05-15 21:03:46
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}

package cn.edu.shu.mall.order.dao;

import cn.edu.shu.mall.order.entity.PaymentInfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 支付信息表
 * 
 * @author lianlianjie
 * @email lloyd@shu.edu.cn
 * @date 2020-05-15 21:10:38
 */
@Mapper
public interface PaymentInfoDao extends BaseMapper<PaymentInfoEntity> {
	
}

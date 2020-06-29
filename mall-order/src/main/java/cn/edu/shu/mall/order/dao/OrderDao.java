package cn.edu.shu.mall.order.dao;

import cn.edu.shu.mall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author lianlianjie
 * @email lloyd@shu.edu.cn
 * @date 2020-05-15 21:10:38
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}

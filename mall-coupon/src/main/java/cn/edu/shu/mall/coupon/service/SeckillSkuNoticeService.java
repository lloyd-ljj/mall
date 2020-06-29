package cn.edu.shu.mall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import cn.edu.shu.common.utils.PageUtils;
import cn.edu.shu.mall.coupon.entity.SeckillSkuNoticeEntity;

import java.util.Map;

/**
 * 秒杀商品通知订阅
 *
 * @author lianlianjie
 * @email lloyd@shu.edu.cn
 * @date 2020-05-15 21:03:47
 */
public interface SeckillSkuNoticeService extends IService<SeckillSkuNoticeEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


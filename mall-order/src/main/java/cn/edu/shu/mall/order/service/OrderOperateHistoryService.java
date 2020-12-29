package cn.edu.shu.mall.order.service;

import cn.edu.shu.common.utils.PageUtils;
import cn.edu.shu.mall.order.entity.OrderOperateHistoryEntity;
import com.baomidou.mybatisplus.extension.service.IService;


import java.util.Map;


public interface OrderOperateHistoryService extends IService<OrderOperateHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


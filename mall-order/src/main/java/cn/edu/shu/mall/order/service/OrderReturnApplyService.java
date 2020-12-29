package cn.edu.shu.mall.order.service;

import cn.edu.shu.common.utils.PageUtils;
import cn.edu.shu.mall.order.entity.OrderReturnApplyEntity;
import com.baomidou.mybatisplus.extension.service.IService;


import java.util.Map;


public interface OrderReturnApplyService extends IService<OrderReturnApplyEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


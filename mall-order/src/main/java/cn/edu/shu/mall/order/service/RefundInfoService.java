package cn.edu.shu.mall.order.service;

import cn.edu.shu.common.utils.PageUtils;
import cn.edu.shu.mall.order.entity.RefundInfoEntity;
import com.baomidou.mybatisplus.extension.service.IService;


import java.util.Map;


public interface RefundInfoService extends IService<RefundInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


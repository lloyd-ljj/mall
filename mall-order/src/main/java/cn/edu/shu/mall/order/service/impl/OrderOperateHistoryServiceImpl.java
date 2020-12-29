package cn.edu.shu.mall.order.service.impl;

import cn.edu.shu.common.utils.PageUtils;
import cn.edu.shu.common.utils.Query;
import cn.edu.shu.mall.order.dao.OrderOperateHistoryDao;
import cn.edu.shu.mall.order.entity.OrderOperateHistoryEntity;
import cn.edu.shu.mall.order.service.OrderOperateHistoryService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import org.springframework.stereotype.Service;

import java.util.Map;


@Service("orderOperateHistoryService")
public class OrderOperateHistoryServiceImpl extends ServiceImpl<OrderOperateHistoryDao, OrderOperateHistoryEntity> implements OrderOperateHistoryService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<OrderOperateHistoryEntity> page = this.page(
                new Query<OrderOperateHistoryEntity>().getPage(params),
                new QueryWrapper<OrderOperateHistoryEntity>()
        );

        return new PageUtils(page);
    }

}
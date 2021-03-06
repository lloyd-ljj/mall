package cn.edu.shu.mall.order.service.impl;

import cn.edu.shu.common.utils.PageUtils;
import cn.edu.shu.common.utils.Query;
import cn.edu.shu.mall.order.dao.OrderReturnApplyDao;
import cn.edu.shu.mall.order.entity.OrderReturnApplyEntity;
import cn.edu.shu.mall.order.service.OrderReturnApplyService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import org.springframework.stereotype.Service;

import java.util.Map;


@Service("orderReturnApplyService")
public class OrderReturnApplyServiceImpl extends ServiceImpl<OrderReturnApplyDao, OrderReturnApplyEntity> implements OrderReturnApplyService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<OrderReturnApplyEntity> page = this.page(
                new Query<OrderReturnApplyEntity>().getPage(params),
                new QueryWrapper<OrderReturnApplyEntity>()
        );

        return new PageUtils(page);
    }

}
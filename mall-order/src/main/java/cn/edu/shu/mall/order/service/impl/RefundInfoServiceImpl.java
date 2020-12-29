package cn.edu.shu.mall.order.service.impl;

import cn.edu.shu.common.utils.PageUtils;
import cn.edu.shu.mall.order.dao.RefundInfoDao;
import cn.edu.shu.mall.order.entity.RefundInfoEntity;
import cn.edu.shu.mall.order.service.RefundInfoService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.Map;


@Service("refundInfoService")
public class RefundInfoServiceImpl extends ServiceImpl<RefundInfoDao, RefundInfoEntity> implements RefundInfoService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<RefundInfoEntity> page = this.page(
                new Query<RefundInfoEntity>().getPage(params),
                new QueryWrapper<RefundInfoEntity>()
        );

        return new PageUtils(page);
    }

}
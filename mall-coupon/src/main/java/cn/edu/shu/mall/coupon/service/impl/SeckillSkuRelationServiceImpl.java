package cn.edu.shu.mall.coupon.service.impl;

import cn.edu.shu.common.utils.PageUtils;
import cn.edu.shu.common.utils.Query;
import cn.edu.shu.mall.coupon.dao.SeckillSkuRelationDao;
import cn.edu.shu.mall.coupon.entity.SeckillSkuRelationEntity;
import cn.edu.shu.mall.coupon.service.SeckillSkuRelationService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.Map;


@Service("seckillSkuRelationService")
public class SeckillSkuRelationServiceImpl extends ServiceImpl<SeckillSkuRelationDao, SeckillSkuRelationEntity> implements SeckillSkuRelationService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {

        QueryWrapper<SeckillSkuRelationEntity> queryWrapper = new QueryWrapper<SeckillSkuRelationEntity>();

        //1、获取key
        String key = (String) params.get("key");

        String promotionSessionId = (String) params.get("promotionSessionId");

        if (!StringUtils.isEmpty(key)) {
            queryWrapper.eq("id", key);
        }

        if (!StringUtils.isEmpty(promotionSessionId)) {
            queryWrapper.eq("promotion_session_id", promotionSessionId);
        }
        IPage<SeckillSkuRelationEntity> page = this.page(
                new Query<SeckillSkuRelationEntity>().getPage(params),
                queryWrapper
        );

        return new PageUtils(page);
    }

}
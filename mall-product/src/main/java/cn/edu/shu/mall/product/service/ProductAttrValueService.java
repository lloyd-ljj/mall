package cn.edu.shu.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import cn.edu.shu.common.utils.PageUtils;
import cn.edu.shu.mall.product.entity.ProductAttrValueEntity;

import java.util.List;
import java.util.Map;

/**
 * spu属性值
 *
 * @author lianlianjie
 * @email lloyd@shu.edu.cn
 * @date 2020-05-15 21:13:17
 */
public interface ProductAttrValueService extends IService<ProductAttrValueEntity> {

    PageUtils queryPage(Map<String, Object> params);

    void saveProductAttr(List<ProductAttrValueEntity> collect);


    List<ProductAttrValueEntity> baseAttrlistforspu(Long spuId);


    void updateSpuAttr(Long spuId, List<ProductAttrValueEntity> entities);
}


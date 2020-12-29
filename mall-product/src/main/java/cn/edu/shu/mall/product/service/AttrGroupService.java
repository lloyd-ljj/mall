package cn.edu.shu.mall.product.service;

import cn.edu.shu.mall.product.vo.AttrGroupWithAttrsVo;
import cn.edu.shu.mall.product.vo.SpuItemAttrGroupVo;
import com.baomidou.mybatisplus.extension.service.IService;
import cn.edu.shu.common.utils.PageUtils;
import cn.edu.shu.mall.product.entity.AttrGroupEntity;

import java.util.List;
import java.util.Map;

/**
 * 属性分组
 *
 * @author lianlianjie
 * @email lloyd@shu.edu.cn
 * @date 2020-05-15 21:13:17
 */
public interface AttrGroupService extends IService<AttrGroupEntity> {


    PageUtils queryPage(Map<String, Object> params);

    PageUtils queryPage(Map<String, Object> params, Long catelogId);


    List<AttrGroupWithAttrsVo> getAttrGroupWithAttrsByCatelogId(Long catelogId);

    List<SpuItemAttrGroupVo> getAttrGroupWithAttrsBySpuId(Long spuId, Long catalogId);

}


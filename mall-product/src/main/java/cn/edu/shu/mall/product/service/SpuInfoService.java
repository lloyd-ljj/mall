package cn.edu.shu.mall.product.service;

import cn.edu.shu.mall.product.vo.SpuSaveVo;
import com.baomidou.mybatisplus.extension.service.IService;
import cn.edu.shu.common.utils.PageUtils;
import cn.edu.shu.mall.product.entity.SpuInfoEntity;

import java.util.Map;

/**
 * spu信息
 *
 * @author lianlianjie
 * @email lloyd@shu.edu.cn
 * @date 2020-05-15 21:13:17
 */
public interface SpuInfoService extends IService<SpuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);

    void saveSpuInfo(SpuSaveVo vo);

    void saveBaseSpuInfo(SpuInfoEntity infoEntity);


    PageUtils queryPageByCondition(Map<String, Object> params);
}


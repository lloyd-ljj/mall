package cn.edu.shu.mall.order.feign;

import cn.edu.shu.mall.order.vo.PayVo;
import com.alipay.api.AlipayApiException;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;


@FeignClient("mall-third-party")
public interface ThridFeignService {

    @GetMapping(value = "/pay",consumes = "application/json")
    String pay(@RequestBody PayVo vo) throws AlipayApiException;

}

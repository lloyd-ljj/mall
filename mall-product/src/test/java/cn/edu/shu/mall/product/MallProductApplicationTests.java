package cn.edu.shu.mall.product;

import cn.edu.shu.mall.product.entity.BrandEntity;
import cn.edu.shu.mall.product.service.BrandService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.List;

@SpringBootTest
public class MallProductApplicationTests {

    @Autowired
    BrandService brandService;


    @Test
    public void contextLoads() {
//        BrandEntity brandEntity = new BrandEntity();
//        brandEntity.setName("ljj");
//        brandService.save(brandEntity);
//        System.out.println("保存成功");

        List<BrandEntity> list = brandService.list(new QueryWrapper<BrandEntity>().eq("brand_id", 1));
        for (BrandEntity b:list) {
            System.out.println(b);
        }
    }

//    @Test
//    public void testupload() throws FileNotFoundException {
//        // Endpoint以杭州为例，其它Region请按实际情况填写。
////        String endpoint = "oss-cn-shanghai.aliyuncs.com";
////        // 云账号AccessKey有所有API访问权限，建议遵循阿里云安全最佳实践，创建并使用RAM子账号进行API访问或日常运维，请登录 https://ram.console.aliyun.com 创建。
////        String accessKeyId = "LTAI4GCWmCLyxkhgu4Z5w5Wh";
////        String accessKeySecret = "laTcVNIoqDcE8JNIw5SJhSsKob0etw";
////
////        // 创建OSSClient实例。
////        OSS ossClient = new OSSClientBuilder().build(endpoint, accessKeyId, accessKeySecret);
//
//        // 上传文件流。
//        InputStream inputStream = new FileInputStream("D:\\code\\mall\\test.txt");
//        ossClient.putObject("mall-ljj", "test.txt", inputStream);
//
//        // 关闭OSSClient。
//        ossClient.shutdown();
//        System.out.println("上传完成");
//    }

}

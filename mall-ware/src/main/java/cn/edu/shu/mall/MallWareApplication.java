package cn.edu.shu.mall;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableFeignClients
@EnableTransactionManagement
@MapperScan("cn.edu.shu.mall.ware.dao")
@EnableDiscoveryClient
@SpringBootApplication
public class MallWareApplication {
    public static void main(String[] args) {
        SpringApplication.run(MallWareApplication.class, args);
    }

}

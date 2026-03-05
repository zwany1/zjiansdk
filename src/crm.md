1.引入依赖
```xml
<dependency>
<groupId>com.zjian.crm</groupId>
<artifactId>zjian-crm-sdk</artifactId>
<version>1.0.0</version>
</dependency>
```
2.配置
```java
package zwy.member.client;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import zjian.ZjianCrmClient;
import zjian.config.CrmSdkConfig;

@Configuration
public class ZjianSdkConfig {

    @Bean
    public ZjianCrmClient zjianCrmClient() {
        // 初始化配置参数
        CrmSdkConfig config = CrmSdkConfig.builder()
                .host("http://118.178.230.10")
                .clientId("1001")
                .clientCode("1001")
                .tenId("1")
                .accessToken("2CD5D8955335CD233646E3BD1962AE45")
                .clientSecret("019c29483dfaaac8e6ec176c8075aa3d")
                .build();
        return new ZjianCrmClient(config);
    }
}
```

3.使用
```java
package zwy.member.config;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zjian.ZjianCrmClient;
import zjian.dto.CustomerInfoResponse;
import zjian.dto.CustomerQueryRequest;

@Slf4j
@Service
public class VehicleService {

    @Autowired
    private ZjianCrmClient crmClient;
    /**
     * 查询会员拥有信息
     */
    public void bindUserVehicle() {
        CustomerQueryRequest params = new CustomerQueryRequest();
        params.setMobile("19175187777");
        CustomerInfoResponse response = crmClient.customer().getCustomerInfo(params);
    }
}
```
package org.tsb.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.netflix.zuul.filters.ZuulProperties;

/**
 * <p>@program: template </p>
 * <p>@description:  </p>
 * <p>@author: Arise Tang </p>
 * <p>@since: 2020-06-20 23:39 </p>
 **/
@EnableZuulProxy
@EnableEurekaClient
@SpringBootApplication
public class ZuulApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZuulApplication.class, args);
    }

    /**
     * 向接口发送post请求以刷新配置: http://127.0.0.1:8040/actuator/refresh
     */
    @RefreshScope
    @ConfigurationProperties("zuul")
    public ZuulProperties zuulProperties() {
        return new ZuulProperties();
    }
}

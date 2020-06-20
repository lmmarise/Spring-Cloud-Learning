package org.tsb.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * <p>@program: template </p>
 * <p>@description:  </p>
 * <p>@author: Arise Tang </p>
 * <p>@since: 2020-06-20 22:36 </p>
 **/
@EnableDiscoveryClient
@EnableHystrixDashboard
@EnableFeignClients
@SpringBootApplication
public class AuthApplication {
    public static void main(String[] args) {
        SpringApplication.run(AuthApplication.class, args);
    }
}

package org.tsb.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * <p>@program: template </p>
 * <p>@description:  </p>
 * <p>@author: Arise Tang </p>
 * <p>@since: 2020-06-20 22:27 </p>
 **/
@EnableEurekaClient
@SpringBootApplication
public class AdminApplication {
    public static void main(String[] args) {
        SpringApplication.run(AdminApplication.class, args);
    }
}

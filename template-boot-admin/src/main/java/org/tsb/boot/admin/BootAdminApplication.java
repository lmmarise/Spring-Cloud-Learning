package org.tsb.boot.admin;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * <p>@program: template </p>
 * <p>@description:  </p>
 * <p>@author: Arise Tang </p>
 * <p>@since: 2020-06-21 01:38 </p>
 **/
@EnableAdminServer
@EnableEurekaClient
@SpringBootApplication
public class BootAdminApplication {
    public static void main(String[] args) {
        SpringApplication.run(BootAdminApplication.class, args);
    }
}

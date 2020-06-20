package org.tsb.admin.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>@program: template </p>
 * <p>@description:  </p>
 * <p>@author: Arise Tang </p>
 * <p>@since: 2020-06-20 22:31 </p>
 **/
@RestController
public class AdminController {
    @GetMapping("/hello/{name}")
    public String hello(@PathVariable String name) {
        return "hello " + name + ", this is template-admin";
    }
}

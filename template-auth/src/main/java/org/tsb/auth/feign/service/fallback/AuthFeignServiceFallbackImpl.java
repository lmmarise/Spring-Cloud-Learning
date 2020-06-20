package org.tsb.auth.feign.service.fallback;

import org.springframework.stereotype.Component;
import org.tsb.auth.feign.service.AuthFeignService;

/**
 * <p>@program: template </p>
 * <p>@description:  </p>
 * <p>@author: Arise Tang </p>
 * <p>@since: 2020-06-20 23:00 </p>
 **/
@Component
public class AuthFeignServiceFallbackImpl implements AuthFeignService {
    /**
     * 当AuthFeignService调用的服务不可用时，Hystrix直接执行这个实现类中的方法，
     * 而不再执行AuthFeignService中的远程调用方法
     * @param name get请求传入的参数
     * @return
     */
    @Override
    public String hello(String name) {
        return "hello " + name + ", this is template-auth, but request error";
    }
}

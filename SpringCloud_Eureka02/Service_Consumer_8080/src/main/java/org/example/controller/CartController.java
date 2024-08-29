package org.example.controller;

import org.example.entity.CommonResult;
import org.example.entity.User;
import org.example.feign.UserFeignService;
import org.example.loadbalance.CustomLoadBalanceConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/cart")
@LoadBalancerClient(name = "provider-server", configuration = CustomLoadBalanceConfiguration.class)
public class CartController {
    //使用OpenFeign，RestTemplate不需要了
//    @Autowired
//    private RestTemplate restTemplate;

    //注入Fegin接口（@EnableFeignClients自动扫描@FeignClient注解）
    @Autowired
    private UserFeignService userFeignService;

    @GetMapping("/hello")
    public String hello() {
//        return restTemplate.getForObject(
////                "http://localhost:8070/user/hello",
//                // 使用@LoadBalanced注解
//                "http://provider-server/user/hello",
//                String.class
//        );
        return userFeignService.Hello();
    }

    @GetMapping("/addCart/{userId}")
    public CommonResult<User> addCart(@PathVariable Integer userId) {
//        CommonResult<User> result = restTemplate.getForObject(
//                "http://localhost:8070/user/getUserById/"+userId,
//                CommonResult.class
//        );
        // 使用@LoadBalanced注解
//        CommonResult<User> result = restTemplate.getForObject(
//                "http://provider-server/user/getUserById/"+userId,
//                CommonResult.class
//        );

        return userFeignService.getUserById(userId);
    }

    @PostMapping("/newCart")
    public CommonResult<User> newCart(User user) {  // 这种接收form-data中的对象
//        CommonResult<User> result = restTemplate.postForObject(
//                "http://provider-server/user/addUser",
//                user,
//                CommonResult.class
//        );

        return userFeignService.newCart(user);
    }

    @PutMapping("/updateCart")
    public CommonResult<User> updateCart(User user) {  // 这种接收form-data中的对象
        // restTemplate的put、delete无返回值
//        restTemplate.put(
//                "http://provider-server/user/updateUser",
//                user
//        );

        // 如果返回为空，说明 put 成功；如果返回码为500，说明失败
        return userFeignService.updateCart(user);
    }

    @DeleteMapping("/removeCart/{userId}")
    public CommonResult<User> removeCart(@PathVariable Integer userId) {
        // 使用exchange可接收返回值
//        CommonResult<User> result = restTemplate.exchange(
//                "http://provider-server/user/removeUserById/"+userId,
//                HttpMethod.DELETE,
//                null,
//                CommonResult.class
//        ).getBody();

        return userFeignService.removeCart(userId);
    }
}

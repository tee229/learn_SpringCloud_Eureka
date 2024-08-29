package org.example.controller;

import org.example.entity.CommonResult;
import org.example.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/cart")
public class CartController {
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/hello")
    public String hello() {
        return restTemplate.getForObject(
                "http://provider-server/user/hello",
                String.class
        );
    }

    @GetMapping("/addCart/{userId}")
    public CommonResult<User> addCart(@PathVariable Integer userId) {
        CommonResult<User> result = restTemplate.getForObject(
                "http://provider-server/user/getUserById/"+userId,
                CommonResult.class
        );

        return result;
    }
}

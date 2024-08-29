package org.example.feign;

import org.example.entity.CommonResult;
import org.example.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient("provider-server")
public interface UserFeignService {
    // @PathVariable 路径参数，一定要用该注解来修饰
    // @RequestBody 此处的Java对象，一定要添加该注解
    // 配置需要调用的挂号服务接口。与UserController中的方法定义一致
    // 而在OpenFeign接口中，会使用@FeignClient注解中的name值，与@GetMapping注解中的value值，共同拼接出与上面一样的url。

    @GetMapping("/user/getUserById/{userId}")
    public CommonResult<User> getUserById(@PathVariable("userId") Integer userId);

    @GetMapping("/user/hello")
    String Hello();

    @PostMapping("/user/addUser")
    public CommonResult<User> newCart(@RequestBody User user);

    @PutMapping("/user/updateUser")
    public CommonResult<User> updateCart(@RequestBody User user);

    @DeleteMapping("/user/removeUserById/{userId}")
    public CommonResult<User> removeCart(@PathVariable("userId") Integer userId);
}

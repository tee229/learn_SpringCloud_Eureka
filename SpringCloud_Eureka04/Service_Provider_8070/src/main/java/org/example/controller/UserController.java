package org.example.controller;

import org.example.entity.CommonResult;
import org.example.entity.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {
    @GetMapping("/hello")
    String Hello() {
        return "hello world!!!";
    }

    @GetMapping("/getUserById/{userId}")
    public CommonResult<User> getUserById(@PathVariable Integer userId) {
        User u = new User(userId, "小明", "123456");
        return new CommonResult<>(200, "success(8070)", u);
    }

    @PostMapping("/addUser")
    public CommonResult<User> addUser(@RequestBody User user) {
        return new CommonResult<>(200, "add success(8070)", user);
    }

    @PutMapping("/updateUser")
    public CommonResult<User> updateUser(@RequestBody User user) {
        return new CommonResult<>(200, "update success(8070)", user);
    }

    @DeleteMapping("/removeUserById/{userId}")
    public CommonResult<User> removeUserById(@PathVariable Integer userId) {
        User u = new User(userId, "小明", "123456");
        return new CommonResult<>(200, "delete success(8070)", u);
    }
}

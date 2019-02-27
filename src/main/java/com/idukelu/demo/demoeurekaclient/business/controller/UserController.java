package com.idukelu.demo.demoeurekaclient.business.controller;

import com.idukelu.demo.demoeurekaclient.business.pojo.dto.User;
import com.idukelu.demo.demoeurekaclient.business.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/user", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("")
    public ResponseEntity<?> createUser(@RequestBody User user) {
        return userService.CreateUser(user);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteUser(@PathVariable String id) {
        return userService.DeleteUser(id);
    }

    @PutMapping("")
    public ResponseEntity<?> updateUser(@RequestBody User user) {
        return userService.updateUser(user);
    }

    @GetMapping("")
    public ResponseEntity<?> getUser(@RequestParam String id, @RequestParam String username) {
        return userService.getUser(id, username);
    }

}

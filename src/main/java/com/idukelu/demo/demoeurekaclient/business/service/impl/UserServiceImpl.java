package com.idukelu.demo.demoeurekaclient.business.service.impl;

import com.idukelu.demo.demoeurekaclient.business.pojo.dto.User;
import com.idukelu.demo.demoeurekaclient.business.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    public ResponseEntity<?> CreateUser(User user) {
        return ResponseEntity.ok(user);
    }

    public ResponseEntity<?> DeleteUser(String id) {
        return ResponseEntity.ok(id);
    }

    public ResponseEntity<?> updateUser(User user) {
        return ResponseEntity.ok(user);
    }

    public ResponseEntity<?> getUser(String id, String username) {
        User user = new User();
        user.setUsername(username);

        return ResponseEntity.ok(user);
    }
}

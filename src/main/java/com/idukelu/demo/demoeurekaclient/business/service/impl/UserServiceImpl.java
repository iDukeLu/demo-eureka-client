package com.idukelu.demo.demoeurekaclient.business.service.impl;

import com.idukelu.demo.demoeurekaclient.business.pojo.dto.User;
import com.idukelu.demo.demoeurekaclient.business.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    public ResponseEntity<?> CreateUser(User user) throws Exception{
        user.setId("1").setUsername("zhangsan").setPassword("1234567");
        return ResponseEntity.ok(user);
    }

    public ResponseEntity<?> DeleteUser(String id) throws Exception {
        return ResponseEntity.ok(id);
    }

    public ResponseEntity<?> updateUser(User user) throws Exception {
        user.setId("2").setUsername("lisi").setPassword("1234567");
        return ResponseEntity.ok(user);
    }

    public ResponseEntity<?> getUser(String id, String username) throws Exception {
        User user = new User();

        if (id != null && id.equals("1")) {
            user.setId("1").setUsername("zhangsan").setPassword("1234567");
            return ResponseEntity.ok(user);
        }

        if (id != null && id.equals("2")) {
            user.setId("2").setUsername("lisi").setPassword("1234567");
            return ResponseEntity.ok(user);
        }

        return null;
    }
}

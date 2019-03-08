package com.idukelu.demo.demoeurekaclient.business.service.impl;

import com.idukelu.demo.demoeurekaclient.business.pojo.dto.User;
import com.idukelu.demo.demoeurekaclient.business.service.EurekaService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class EurekaServiceImpl implements EurekaService {
    public ResponseEntity<?> createUser(User user) throws Exception{
        user.setId("eureka");
        return ResponseEntity.ok(user);
    }

    public ResponseEntity<?> deleteUser(String id) throws Exception {
        User user = new User();
        user.setId("eureka");
        return ResponseEntity.ok(id);
    }

    public ResponseEntity<?> updateUser(User user) throws Exception {
        user.setId("eureka");
        return ResponseEntity.ok(user);
    }

    public ResponseEntity<?> getUser(String id, String username) throws Exception {
        User user = new User();

        if (id != null && id.equals("1")) {
            user.setId("1").setUsername("eureka-zhangsan").setPassword("1234567");
            return ResponseEntity.ok(user);
        }

        if (id != null && id.equals("2")) {
            user.setId("2").setUsername("eureka-lisi").setPassword("1234567");
            return ResponseEntity.ok(user);
        }

        return null;
    }
}

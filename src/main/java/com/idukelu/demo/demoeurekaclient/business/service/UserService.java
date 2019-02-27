package com.idukelu.demo.demoeurekaclient.business.service;

import com.idukelu.demo.demoeurekaclient.business.pojo.dto.User;
import org.springframework.http.ResponseEntity;

public interface UserService {
    ResponseEntity<?> CreateUser(User user);

    ResponseEntity<?> DeleteUser(String id);

    ResponseEntity<?> updateUser(User user);

    ResponseEntity<?> getUser(String id, String username);
}

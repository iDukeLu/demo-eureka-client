package com.idukelu.demo.demoeurekaclient.business.service;

import com.idukelu.demo.demoeurekaclient.business.pojo.dto.User;
import org.springframework.http.ResponseEntity;

public interface UserService {
    ResponseEntity<?> CreateUser(User user) throws Exception;

    ResponseEntity<?> DeleteUser(String id) throws Exception;

    ResponseEntity<?> updateUser(User user) throws Exception;

    ResponseEntity<?> getUser(String id, String username) throws Exception;
}

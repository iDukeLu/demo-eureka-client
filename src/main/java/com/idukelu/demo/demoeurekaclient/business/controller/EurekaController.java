package com.idukelu.demo.demoeurekaclient.business.controller;

import com.idukelu.demo.demoeurekaclient.business.pojo.dto.User;
import com.idukelu.demo.demoeurekaclient.business.service.EurekaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/user", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class EurekaController {

    private EurekaService eurekaService;

    @Autowired
    public EurekaController(EurekaService eurekaService) {
        this.eurekaService = eurekaService;
    }


    @PostMapping("")
    public ResponseEntity<?> createUser(@RequestBody User user) throws Exception {
        return eurekaService.createUser(user);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteUser(@PathVariable String id) throws Exception {
        return eurekaService.deleteUser(id);
    }

    @PutMapping("")
    public ResponseEntity<?> updateUser(@RequestBody User user) throws Exception {
        return eurekaService.updateUser(user);
    }

    @GetMapping("")
    public ResponseEntity<?> getUser(@RequestParam(required = false) String id, @RequestParam(required = false) String username) throws Exception {
        return eurekaService.getUser(id, username);
    }
}

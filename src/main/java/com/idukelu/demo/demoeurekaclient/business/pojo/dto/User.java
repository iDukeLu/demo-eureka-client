package com.idukelu.demo.demoeurekaclient.business.pojo.dto;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class User {

    private String id;

    private String username;

    private String password;

}
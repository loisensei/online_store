package com.ltw.online_store.Dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class UserDto implements Serializable {
    private final Long id;
    private final String fullName;
    private final String userName;
    private final String email;
    private final String address;
    private final String password;
}

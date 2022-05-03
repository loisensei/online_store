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
    private String password;
    private final String roleName;

    public UserDto(Long id, String fullName, String userName, String email, String address, String roleName){
        this.id = id;
        this.fullName = fullName;
        this.userName = userName;

        this.email = email;
        this.address = address;
        this.roleName = roleName;
    }
}

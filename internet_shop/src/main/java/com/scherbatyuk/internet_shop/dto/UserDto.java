package com.scherbatyuk.internet_shop.dto;

import com.scherbatyuk.internet_shop.domain.Role;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserDto {

    private String firstName;
    private String lastName;
    private Integer age;
    private String email;
    private String password;
    private String matchingPassword;


}

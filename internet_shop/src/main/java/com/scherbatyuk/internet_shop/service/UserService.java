package com.scherbatyuk.internet_shop.service;

import com.scherbatyuk.internet_shop.dto.UserDto;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {

    boolean save (UserDto userDto);
}

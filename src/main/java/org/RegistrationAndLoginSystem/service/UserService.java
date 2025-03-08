package org.RegistrationAndLoginSystem.service;

import org.RegistrationAndLoginSystem.dto.UserDto;
import org.RegistrationAndLoginSystem.entity.User;

import java.util.List;


public interface UserService {
    void saveUser(UserDto userDto);

    User findUserByEmail(String email);

    List<UserDto> findAllUsers();

}

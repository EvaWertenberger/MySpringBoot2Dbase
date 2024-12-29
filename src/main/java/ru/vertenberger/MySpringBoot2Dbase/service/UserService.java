package ru.vertenberger.MySpringBoot2Dbase.service;

import ru.vertenberger.MySpringBoot2Dbase.dto.UserDto;
import ru.vertenberger.MySpringBoot2Dbase.entity.User;
import java.util.List;

public interface UserService {
    void saveUser(UserDto userDto);
    User findUserByEmail(String email);
    List<UserDto> findAllUsers();
}

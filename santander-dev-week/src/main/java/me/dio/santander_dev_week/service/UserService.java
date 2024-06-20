package me.dio.santander_dev_week.service;

import me.dio.santander_dev_week.model.User;

public interface UserService {

    User findById(Long id);

    User create(User user);

    
}

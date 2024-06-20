package me.dio.santander_dev_week.service.impl;

import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import me.dio.santander_dev_week.model.User;
import me.dio.santander_dev_week.model.repository.UserRepository;
import me.dio.santander_dev_week.service.UserService;

@Service
public class UserServiceImpl implements UserService{

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User findById(Long id) {
        return userRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public User create(User user) {
        if(userRepository.existsByAccountNumber(user.getAccount().getNumber())){
            throw new IllegalArgumentException("This account number is already in use");
        }
        return userRepository.save(user);
    }

}

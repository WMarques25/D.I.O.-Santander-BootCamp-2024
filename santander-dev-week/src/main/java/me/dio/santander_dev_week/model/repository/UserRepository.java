package me.dio.santander_dev_week.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import me.dio.santander_dev_week.model.User;

public interface UserRepository extends JpaRepository<User, Long>{

    boolean existsByAccountNumber(String accountNumber);
}

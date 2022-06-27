package com.example.piG1.Repository;

import com.example.piG1.Model.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepository extends JpaRepository<User, Integer> {
    User findByUserName(String username);
}

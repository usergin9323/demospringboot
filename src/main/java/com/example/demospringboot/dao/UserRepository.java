package com.example.demospringboot.dao;

import com.example.demospringboot.bean.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

}

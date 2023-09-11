package com.loanapp.loanappbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.loanapp.loanappbackend.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}

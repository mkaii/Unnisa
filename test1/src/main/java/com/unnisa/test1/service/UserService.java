package com.unnisa.test1.service;


import com.unnisa.test1.model.User;
import com.unnisa.test1.repo.IUserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    IUserRepo userRepo;


    public void addUser(User myUser) {
        userRepo.save(myUser);
    }

    public List<User> getAllUsers() {

        return userRepo.findAll();
    }

    public User getUserById(Integer id) {
        return userRepo.findById(id).get();
    }
}

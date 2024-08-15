package com.unnisa.test1.repo;

import com.unnisa.test1.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepo extends JpaRepository<User,Integer> {
}

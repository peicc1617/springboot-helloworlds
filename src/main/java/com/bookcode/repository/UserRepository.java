package com.bookcode.repository;

import com.bookcode.model.User;
import org.springframework.data.repository.CrudRepository;

/**
 * @基本功能:
 * @program:springboot-helloworlds
 * @author:peicc
 * @create:2019-12-23 12:22:25
 **/
public interface UserRepository extends CrudRepository<User,Integer> {
    User findById(int id);
}

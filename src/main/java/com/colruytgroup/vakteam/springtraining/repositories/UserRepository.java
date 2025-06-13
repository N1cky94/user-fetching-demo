package com.colruytgroup.vakteam.springtraining.repositories;

import com.colruytgroup.vakteam.springtraining.model.User;

import java.util.List;

public interface UserRepository {
    User deleteUserById(long id);
    User findUserById(long id);
    List<User> getAllByEmailDomain(String pattern);
    void saveUser(User u);
}

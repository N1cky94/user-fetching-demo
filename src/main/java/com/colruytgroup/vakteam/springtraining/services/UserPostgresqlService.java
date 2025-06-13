package com.colruytgroup.vakteam.springtraining.services;

import com.colruytgroup.vakteam.springtraining.model.User;
import com.colruytgroup.vakteam.springtraining.repositories.UserRepository;
import com.colruytgroup.vakteam.springtraining.services.commands.ChangeUserPasswordCommand;

public class UserPostgresqlService implements UserService {
    private UserRepository repo;

    public UserPostgresqlService(UserRepository repo) {
        this.repo = repo;
    }

    @Override
    public User getUserById(long id) {
        return null;
    }

    @Override
    public void printAllUsersWithId(long id) {

    }

    @Override
    public void resetUserPassword(ChangeUserPasswordCommand command) {

    }
}

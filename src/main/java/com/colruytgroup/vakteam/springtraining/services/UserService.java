package com.colruytgroup.vakteam.springtraining.services;

import com.colruytgroup.vakteam.springtraining.model.User;
import com.colruytgroup.vakteam.springtraining.services.commands.ChangeUserPasswordCommand;

public interface UserService {
    User getUserById(long id);
    void printAllUsersWithId(long id);
    void resetUserPassword(ChangeUserPasswordCommand command);
}

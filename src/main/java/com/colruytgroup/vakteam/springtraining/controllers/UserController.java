package com.colruytgroup.vakteam.springtraining.controllers;

import com.colruytgroup.vakteam.springtraining.model.dto.UserInfoDto;
import com.colruytgroup.vakteam.springtraining.services.commands.ChangeUserPasswordCommand;

public interface UserController {
    void requestPrintUserById(long id);
    UserInfoDto requestUserById(long id);
    void resetPassword(ChangeUserPasswordCommand command);
}

package com.colruytgroup.vakteam.springtraining.controllers;

import com.colruytgroup.vakteam.springtraining.model.dto.UserInfoDto;
import com.colruytgroup.vakteam.springtraining.services.UserService;
import com.colruytgroup.vakteam.springtraining.services.commands.ChangeUserPasswordCommand;

public class UserRestController implements UserController {
    private UserService service;

    public UserRestController(UserService service) {
        this.service = service;
    }

    @Override
    public void requestPrintUserById(long id) {

    }

    @Override
    public UserInfoDto requestUserById(long id) {
        return null;
    }

    @Override
    public void resetPassword(ChangeUserPasswordCommand command) {

    }
}

package com.colruytgroup.vakteam.springtraining.controllers;

import com.colruytgroup.vakteam.springtraining.model.dto.UserInfoDto;
import com.colruytgroup.vakteam.springtraining.services.UserInMemoryService;
import com.colruytgroup.vakteam.springtraining.services.UserService;

public class UserRestController implements UserController {
    private UserService service;

    public UserRestController(UserService service) {
        this.service = service;
    }

    @Override
    public void requestPrintUserById() {

    }

    @Override
    public UserInfoDto requestUserById() {
        return null;
    }

    @Override
    public void resetPassword() {

    }
}

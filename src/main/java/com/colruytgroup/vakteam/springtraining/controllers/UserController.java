package com.colruytgroup.vakteam.springtraining.controllers;

import com.colruytgroup.vakteam.springtraining.model.dto.UserInfoDto;

public interface UserController {
    void requestPrintUserById();
    UserInfoDto requestUserById();
    void resetPassword();
}

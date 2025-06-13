package com.colruytgroup.vakteam.springtraining.controllers;

import com.colruytgroup.vakteam.springtraining.model.dto.UserInfoDto;
import com.colruytgroup.vakteam.springtraining.services.UserService;
import com.colruytgroup.vakteam.springtraining.services.commands.ChangeUserPasswordCommand;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class UserConsoleController implements UserController {
    private final UserService service;

    @Override
    public void requestPrintUserById(long id) {
        service.printAllUsersWithId(id);
    }

    @Override
    public UserInfoDto requestUserById(long id) {
        return UserInfoDto.from(service.getUserById(id));
    }

    @Override
    public void resetPassword(ChangeUserPasswordCommand changePasswordCommand) {
        service.resetUserPassword(changePasswordCommand);
    }
}

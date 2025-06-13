package com.colruytgroup.vakteam.springtraining.controllers;

import com.colruytgroup.vakteam.springtraining.model.dto.UserInfoDto;
import com.colruytgroup.vakteam.springtraining.services.UserInMemoryService;
import com.colruytgroup.vakteam.springtraining.services.commands.ChangeUserPasswordCommand;

import java.util.Scanner;

public class UserConsoleController implements UserController {
    private static final Scanner KEYBOARD = new Scanner(System.in);

    private UserInMemoryService service;

    public UserConsoleController(UserInMemoryService service) {
        this.service = service;
    }

    @Override
    public void requestPrintUserById() {
        long selection = KEYBOARD.nextLong();

        service.printAllUsersWithId(selection);
    }

    @Override
    public UserInfoDto requestUserById() {
        long selection = KEYBOARD.nextLong();

        return UserInfoDto.from(service.getUserById(selection));
    }

    @Override
    public void resetPassword() {
        long id = KEYBOARD.nextLong();
        String newPass = KEYBOARD.nextLine();
        String oldPass = KEYBOARD.nextLine();

        var com = new ChangeUserPasswordCommand(id, newPass, oldPass);

        service.resetUserPassword(com);
    }
}

package com.colruytgroup.vakteam.springtraining.views;

import com.colruytgroup.vakteam.springtraining.controllers.UserController;
import com.colruytgroup.vakteam.springtraining.model.dto.UserInfoDto;
import com.colruytgroup.vakteam.springtraining.services.commands.ChangeUserPasswordCommand;

import java.util.Scanner;

public class UserView {
    private static final Scanner KEYBOARD = new Scanner(System.in);
    private UserController controller;

    public UserView(UserController controller) {
        this.controller = controller;
    }

    public void show() {
        System.out.println("Provide a user ID of a user you want to print");
        long id = KEYBOARD.nextLong();

        controller.requestPrintUserById(id);

        UserInfoDto user = controller.requestUserById(id);

        System.out.println("Provide your current password");
        String currentPassword = KEYBOARD.next();

        System.out.println("Provide your new password");
        String newPassword = KEYBOARD.next();

        ChangeUserPasswordCommand command = new ChangeUserPasswordCommand(
                user.id(),
                newPassword,
                currentPassword
        );

        controller.resetPassword(command);
        controller.requestPrintUserById(user.id());
    }
}

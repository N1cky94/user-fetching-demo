package com.colruytgroup.vakteam.springtraining.services.commands;

public record ChangeUserPasswordCommand(
        long id,
        String newPassword,
        String oldPassword
) {
}

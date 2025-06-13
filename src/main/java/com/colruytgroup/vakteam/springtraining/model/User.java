package com.colruytgroup.vakteam.springtraining.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString
public class User {
    private Long id;
    private String name;
    private String password;
    private String email;

    public void changePassword(String oldPassword, String newPassword) {
        if (this.password.equals(oldPassword)) {
            this.password = newPassword;
        } else {
            throw new RuntimeException("Old password didn't match");
        }
    }
}

package com.colruytgroup.vakteam.springtraining.model.dto;

import com.colruytgroup.vakteam.springtraining.model.User;

public record UserInfoDto(
        long id,
        String name
) {

    public static UserInfoDto from(User u) {
        return new UserInfoDto(
                u.getId(),
                u.getName()
        );
    }
}

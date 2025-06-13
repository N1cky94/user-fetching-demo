package com.colruytgroup.vakteam.springtraining.services;

import com.colruytgroup.vakteam.springtraining.model.User;
import com.colruytgroup.vakteam.springtraining.repositories.UserRepository;
import com.colruytgroup.vakteam.springtraining.services.commands.ChangeUserPasswordCommand;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
@RequiredArgsConstructor
public class UserInMemoryService implements UserService {
    private final UserRepository repository;

    public void printAllUsersWithId(long id) {
        User user = repository.findUserById(id);
        System.out.println(user);
    }

    public void resetUserPassword(ChangeUserPasswordCommand command) {
        Optional<User> optionalUser = Optional.of(repository.findUserById(command.id()));
        User u = optionalUser.orElseThrow(() -> new RuntimeException(command.id() + " Not recognized"));

        validatePassword(command.newPassword());
        u.changePassword(command.oldPassword(), command.newPassword());
    }

    public User getUserById(long id) {
        return repository.findUserById(id);
    }

    private void validatePassword(String password) {
        if (!(password.length() >= 4)) {
            throw new RuntimeException("New Password not accepted, should atleast be 4 characters long");
        }
    }
}

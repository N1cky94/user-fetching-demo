package com.colruytgroup.vakteam.springtraining.repositories;

import com.colruytgroup.vakteam.springtraining.model.User;

import java.util.List;
import java.util.function.Predicate;

public class UserInMemoryRepository implements UserRepository {
    private static final List<User> USERS = List.of(
            new User(0l, "Nick", "hello1!", "nick@cgi.be"),
            new User(1l, "Matthias", "hello2!", "matthias@cgi.be"),
            new User(3l, "Bert", "Hello3!", "bert@cgi.be")
    );

    public User findUserById(long id) {
        return USERS.stream()
                .filter(u -> u.getId().equals(id))
                .toList()
                .getFirst();
    }

    public List<User> getAllByEmailDomain(String domain) {
        return USERS.stream()
                .filter(u -> u.getEmail().contains(domain))
                .toList();
    }

    public void saveUser(User newUser) {
        USERS.add(newUser);
    }

    public User deleteUserById(long id) {
        User userToRemove = findUserById(id);
        USERS.remove(userToRemove);

        return userToRemove;
    }
}

package com.colruytgroup.vakteam.springtraining;

import com.colruytgroup.vakteam.springtraining.controllers.UserConsoleController;
import com.colruytgroup.vakteam.springtraining.controllers.UserController;
import com.colruytgroup.vakteam.springtraining.repositories.UserInMemoryRepository;
import com.colruytgroup.vakteam.springtraining.repositories.UserRepository;
import com.colruytgroup.vakteam.springtraining.services.UserInMemoryService;
import com.colruytgroup.vakteam.springtraining.services.UserService;
import com.colruytgroup.vakteam.springtraining.views.UserView;

public class NotSpringApplication {

    public static void main(String[] args) {
        UserRepository repo = new UserInMemoryRepository();
        UserService service = new UserInMemoryService(repo);
        UserController controller = new UserConsoleController(service);
        UserView view = new UserView(controller);


        view.show();

    }

}

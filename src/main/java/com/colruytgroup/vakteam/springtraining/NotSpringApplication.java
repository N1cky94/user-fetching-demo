package com.colruytgroup.vakteam.springtraining;

import com.colruytgroup.vakteam.springtraining.controllers.UserController;
import com.colruytgroup.vakteam.springtraining.controllers.UserRestController;
import com.colruytgroup.vakteam.springtraining.repositories.UserInMemoryRepository;
import com.colruytgroup.vakteam.springtraining.repositories.UserRepository;
import com.colruytgroup.vakteam.springtraining.services.UserInMemoryService;
import com.colruytgroup.vakteam.springtraining.services.UserService;

public class NotSpringApplication {

    public static void main(String[] args) {
        UserRepository repo = new UserInMemoryRepository();
        UserService service = new UserInMemoryService(repo);
        UserController controller = new UserRestController(service);


        System.out.println("Provide the id for the user you want to fetch");
        controller.requestPrintUserById();

    }

}

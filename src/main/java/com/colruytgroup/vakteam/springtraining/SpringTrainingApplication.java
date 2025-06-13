package com.colruytgroup.vakteam.springtraining;

import com.colruytgroup.vakteam.springtraining.views.UserView;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringTrainingApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = SpringApplication.run(SpringTrainingApplication.class, args);

        UserView view = ctx.getBean(UserView.class);
        view.show();
    }

}

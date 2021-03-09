package ru.kse.sfgdi.controllers;

import org.springframework.stereotype.Controller;
import ru.kse.sfgdi.services.GreetingService;

/**
 * Created by KSE on 08.03.2021 18:12
 */
@Controller
public class MyController {

    private GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
        return greetingService.sayGreeting();
    }
}

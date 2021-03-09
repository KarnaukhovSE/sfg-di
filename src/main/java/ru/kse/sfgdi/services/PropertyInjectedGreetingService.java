package ru.kse.sfgdi.services;

import org.springframework.stereotype.Service;

/**
 * Created by KSE on 08.03.2021 23:45
 */
@Service
public class PropertyInjectedGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello, World!!! -- Property";
    }
}

package ru.kse.sfgdi.services;

import org.springframework.stereotype.Service;

/**
 * Created by KSE on 08.03.2021 21:55
 */
@Service
public class ConstructorGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello, World!!! -- Constructor";
    }
}

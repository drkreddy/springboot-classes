package com.example.demo;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;


@Component
public class MyHealthIndicator implements HealthIndicator {
    @Override
    public Health health() {
        //DB connections
        //Internet connection is live or not

        //channels
        return Health.outOfService().build();
    }
}

package com.example.demo;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import java.util.Date;

@Configuration
@EnableScheduling
public class MySchedulerConfiguration {
    @Scheduled(fixedRate = 5000)
    public void executeMytask(){
        System.out.println(Thread.currentThread().getName() + "  Task 1 executed at " + new Date());
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    @Scheduled(fixedRate = 10000)
    public void executeMytask2(){
        System.out.println(Thread.currentThread().getName() + "  Task 2 executed at " + new Date());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}

package mydemo.scheduler;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import java.util.Date;


@Configuration
@EnableScheduling
public class SchedulerConfiguration {
    @Scheduled(fixedRate = 5000)
    public void executeTask1() {
        System.out.println(Thread.currentThread().getName()+" The Task1 executed at "+ new Date());
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    @Scheduled(fixedRate = 1000)
    public void executeTask2() {
        System.out.println(Thread.currentThread().getName()+" The Task2 executed at "+ new Date());
    }
}
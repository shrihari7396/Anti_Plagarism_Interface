package edu.pict.questionmangement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class QuestionManagementApplication {

    public static void main(String[] args) {
        SpringApplication.run(QuestionManagementApplication.class, args);
    }

}

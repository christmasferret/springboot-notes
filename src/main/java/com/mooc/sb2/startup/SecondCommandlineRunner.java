package com.mooc.sb2.startup;

import com.mooc.sb2.transaction.JdbcUser;
import com.mooc.sb2.transaction.UserJdbcTemplate;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(2)
public class SecondCommandlineRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {

        System.out.println("\u001B[32m >>> startup second runner<<<");
    }
}

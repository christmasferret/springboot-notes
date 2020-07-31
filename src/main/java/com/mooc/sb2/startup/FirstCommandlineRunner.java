package com.mooc.sb2.startup;

import com.mooc.sb2.aop.AopBean;
import com.mooc.sb2.transaction.JdbcUser;
import com.mooc.sb2.transaction.UserDao;
import com.mooc.sb2.transaction.UserJdbcTemplate;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(1)
public class FirstCommandlineRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        ApplicationContext context = new ClassPathXmlApplicationContext("*/*.xml");
        AopBean bean = (AopBean) context.getBean("aopTestBean");
        bean.testAop();

//        ApplicationContext context = new ClassPathXmlApplicationContext("transaction/transaction.xml");
        UserDao jdbcTemplate = (UserDao) context.getBean("userJdbcTemplate");
        System.out.println("--- Records Creation start ----");
        JdbcUser user = new JdbcUser(4, "test", 21);
        jdbcTemplate.insertUser(user);
        try {
            jdbcTemplate.deleteById(4);
        } catch (Exception e) {
            System.out.println("roll back");
        }

        System.out.println("\u001B[32m >>> startup first runner<<<");
    }
}

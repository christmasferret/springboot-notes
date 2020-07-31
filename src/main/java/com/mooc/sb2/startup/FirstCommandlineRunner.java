package com.mooc.sb2.startup;

import com.mooc.sb2.aop.AopBean;
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
        ApplicationContext context = new ClassPathXmlApplicationContext("aop/aop.xml");
        AopBean bean = (AopBean) context.getBean("aopTestBean");
        bean.testAop();
        System.out.println("\u001B[32m >>> startup first runner<<<");
    }
}

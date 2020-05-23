package com.mooc.sb2;

import com.mooc.sb2.bean.Demo;
import com.mooc.sb2.condi.A;
import com.mooc.sb2.mapper.DemoMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {Sb2Application.class})
public class Sb2ApplicationTests implements ApplicationContextAware {

    private ApplicationContext applicationContext;

    @Autowired
    private DemoMapper demoMapper;

    @Override
    public void setApplicationContext(ApplicationContext context) throws BeansException {
        applicationContext = context;
    }

    @Test
    public void testA() {
        System.out.println(applicationContext.getBean(A.class));
    }

    @Test
    public void testB() {
        Demo demo = new Demo();
        demo.setName("xx");
        demo.setJob("student");
        System.out.println(demoMapper.insert(demo));
    }

}

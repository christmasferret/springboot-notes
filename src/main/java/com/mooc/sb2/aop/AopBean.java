package com.mooc.sb2.aop;

public class AopBean {

    private String testStr = "testStr";

    public void testAop() {
        // 被拦截的方法，简单打印
        System.out.println("I am the true aop bean");
    }
}
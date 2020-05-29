package com.Spring;


import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;

import com.Spring.Models.Mobile;


public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("MobileContext.xml");
        Mobile mobile = (Mobile) context.getBean("mobile");
        
        System.out.println(mobile);
    }
}

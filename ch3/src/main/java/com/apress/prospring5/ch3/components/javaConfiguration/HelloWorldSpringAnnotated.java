package com.apress.prospring5.ch3.components.javaConfiguration;

import com.apress.prospring5.ch3.decoupled.MessageRenderer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class HelloWorldSpringAnnotated {

    public static void main( String [] args ){
        ApplicationContext context = new AnnotationConfigApplicationContext( HelloWorldConfiguration.class );
        MessageRenderer mr = context.getBean("renderer", MessageRenderer.class);
        mr.render();

    }

}

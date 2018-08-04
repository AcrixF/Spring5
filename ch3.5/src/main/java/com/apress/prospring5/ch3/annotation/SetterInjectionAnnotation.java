package com.apress.prospring5.ch3.annotation;

import com.apress.prospring5.ch3.decoupled.MessageRenderer;
import org.springframework.context.support.GenericXmlApplicationContext;

public class SetterInjectionAnnotation {

    public static void main(String [] args ) {

        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:spring/app-context-xml.xml");
        ctx.refresh();
        MessageRenderer messageRenderer = ctx.getBean("renderer", MessageRenderer.class);
        messageRenderer.render();
        ctx.close();
    }

}

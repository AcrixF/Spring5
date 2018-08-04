package com.apress.prospring5.ch3.components.annotationConfiguration;

import com.apress.prospring5.ch3.decoupled.MessageRenderer;
import org.springframework.context.support.GenericXmlApplicationContext;

public class DeclareSpringComponents {

    public static void main(String [] args ) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        //ctx.load("classpath:spring/app-context-xml.xml");
        ctx.load("classpath:spring/app-context-annotation.xml");
        ctx.refresh();
        MessageRenderer messageRenderer = ctx.getBean("renderer", MessageRenderer.class);
        messageRenderer.render();
        ctx.close();

    }

}

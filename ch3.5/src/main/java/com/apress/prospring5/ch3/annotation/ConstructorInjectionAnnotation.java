package com.apress.prospring5.ch3.annotation;

import com.apress.prospring5.ch3.decoupled.MessageProvider;
import com.apress.prospring5.ch3.decoupled.MessageRenderer;
import org.springframework.context.support.GenericXmlApplicationContext;

public class ConstructorInjectionAnnotation {

    public static void main( String [] args ) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:spring/app-context-annotation-constructor.xml");
        ctx.refresh();
        //MessageProvider messageProvider = ctx.getBean("provider",MessageProvider.class);
        //System.out.println( messageProvider.getMessage() );

        MessageRenderer messageRendere = ctx.getBean("rendererAnnotation",MessageRenderer.class);
        messageRendere.render();

        ctx.close();
    }

}

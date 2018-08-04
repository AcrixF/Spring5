package com.apress.prospring5.ch3.components.annotationConfiguration;

import com.apress.prospring5.ch3.decoupled.MessageProvider;
import org.springframework.stereotype.Component;

@Component("provider")
public class HelloWorldMessageProvider implements MessageProvider {

    public String getMessage(){
        return "Hello world!";
    }

}

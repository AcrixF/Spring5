package com.apress.prospring5.ch3.components.javaConfigurationWithoutAnnotation;

import com.apress.prospring5.ch3.decoupled.HelloWorldMessageProvider;
import com.apress.prospring5.ch3.decoupled.MessageProvider;
import com.apress.prospring5.ch3.decoupled.MessageRenderer;
import com.apress.prospring5.ch3.decoupled.StandardOutMessageRenderer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan(basePackages = "com.apress.prospring5.ch3.components.javaConfigurationWithoutAnnotation")
@Configuration
public class HelloWorldConfiguration {

    public MessageProvider provider() {
        return new HelloWorldMessageProvider();
    }

    MessageRenderer renderer() {
        MessageRenderer renderer = new StandardOutMessageRenderer();
        renderer.setMessageProvider( provider() );
        return renderer;
    }
}

package com.apress.prospring5.ch3.utilitaries;

public class HelloWorldMessageProvider implements MessageProvider {

    public String getMessage() {
        return "Hello World!";
    }

}

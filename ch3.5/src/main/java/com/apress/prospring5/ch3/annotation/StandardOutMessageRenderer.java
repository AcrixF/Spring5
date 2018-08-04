package com.apress.prospring5.ch3.annotation;

import com.apress.prospring5.ch3.decoupled.MessageProvider;
import com.apress.prospring5.ch3.decoupled.MessageRenderer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("renderer")
public class StandardOutMessageRenderer implements MessageRenderer {

    private MessageProvider messageProvider;

    public void render() {
        if( messageProvider == null ) {
            throw new RuntimeException("You must set the property messageProvider of class: " + com.apress.prospring5.ch3.decoupled.StandardOutMessageRenderer.class.getName() );
        }
        System.out.println( messageProvider.getMessage());
    }

    @Autowired
    public void setMessageProvider( MessageProvider provider ) {
        this.messageProvider = provider;
    }

    public MessageProvider getMessageProvider() {
        return this.messageProvider;
    }

}

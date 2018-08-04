package com.apress.prospring5.ch3.annotation;

import com.apress.prospring5.ch3.decoupled.MessageProvider;
import com.apress.prospring5.ch3.decoupled.MessageRenderer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("rendererAnnotation")
public class StandatOutMessageRendererAnnotation implements MessageRenderer {

    private MessageProvider configurableMessageProvider;


    public void render() {
        if( configurableMessageProvider == null ) {
            throw new RuntimeException("You must set the property messageProvider of class: " + com.apress.prospring5.ch3.decoupled.StandardOutMessageRenderer.class.getName() );
        }
        System.out.println( configurableMessageProvider.getMessage());
    }

    @Autowired
    public void setMessageProvider(MessageProvider configurableMessageProvider) {
        this.configurableMessageProvider = configurableMessageProvider;
    }

    public MessageProvider getMessageProvider() {
        return this.configurableMessageProvider;
    }
}

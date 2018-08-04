package com.apress.prospring5.ch3.components.xmlConfiguration;

import com.apress.prospring5.ch3.decoupled.MessageProvider;
import com.apress.prospring5.ch3.decoupled.MessageRenderer;

public class StandardOutMessageRenderer implements MessageRenderer {

    private MessageProvider messageProvider;

    public void render() {
        if (messageProvider == null) {
            throw new RuntimeException(
                    "You must set the property messageProvider of class:"
                            + StandardOutMessageRenderer.class.getName());
        }

        System.out.println(messageProvider.getMessage());
    }

    public void setMessageProvider(MessageProvider provider) {
        this.messageProvider = provider;
    }

    public MessageProvider getMessageProvider() {
        return this.messageProvider;
    }

}

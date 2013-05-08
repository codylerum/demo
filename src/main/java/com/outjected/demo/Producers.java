package com.outjected.demo;

import javax.enterprise.context.Conversation;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Produces;
import javax.inject.Named;


public class Producers {
    
    @Produces
    @Demo
    @RequestScoped
    @Named
    public Conversation conversation(Conversation conversation) {
        return conversation;
    }
}

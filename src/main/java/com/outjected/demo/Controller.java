package com.outjected.demo;

import javax.enterprise.context.Conversation;
import javax.enterprise.context.ConversationScoped;
import javax.inject.Inject;
import javax.inject.Named;

import java.io.Serializable;

@ConversationScoped
@Named
public class Controller implements Serializable {

    private static final long serialVersionUID = 1L;

    @Inject
    private Conversation conversation;

    public String goToPage2() {
        conversation.begin();
        return "page2.xhtml?faces-redirect=true";
    }
}

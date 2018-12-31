package com.sample.struts;

import com.opensymphony.xwork2.ActionSupport;

public class HelloWorldAction extends ActionSupport 
{
    private MessageStore messageStore;
    private static int helloCount = 0;

    public String execute() {
    	helloCount++;
        return SUCCESS;
    }

    public MessageStore getMessageStore() {
        return messageStore;
    }
    
    public void setMessageStore(MessageStore message) {
        messageStore = message;
    }
    
    public int getHelloCount()
    {
    	return helloCount;
    }
}
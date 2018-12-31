package com.sample.struts;

public class MessageStore 
{
    private String message;
    
    public MessageStore() {
        message = "Hey ";
    }

    public String getMessage() {
        return message;
    }
    
    public void setMessage(String message) {
        this.message += message;
    }
}
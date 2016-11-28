package com.demo.springmvc.domain;

/**
 * Created by vagrant on 11/26/16.
 */

public class Message {
    private String name;
    private String text;

    public Message(){

    }

    public Message(String name, String text){
        this.name=name;
        this.text=text;
    }

    public String getName() {
        return name;
    }

    public String getText() {
        return text;
    }
}

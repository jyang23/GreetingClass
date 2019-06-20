package com.jy;

public class Greeting {
    private String greeting;
    private String sender;

    // Constructor runs when the keyword 'new' is encountered
    public Greeting() {
        System.out.println("The constructor has run");
    }

    // Overloaded constructor allows us to pass parameters
    public Greeting(String greeting, String sender) {
        this.greeting = greeting;
        this.sender = sender;
    }

    public String displayMessage() {
        return sender + " says " + greeting;
    }

    public String getGreeting() {
        return greeting;
    }

    public String getSender(){
        return sender;
    }

    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }
}
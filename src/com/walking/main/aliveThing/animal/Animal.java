package com.walking.main.aliveThing.animal;

public class Animal {
    protected String article;
    protected Animal() {
        getPhrase();
    }
    public void getPhrase() {
        System.out.println("I'm an Animal");
    }
}
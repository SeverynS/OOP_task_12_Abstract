package com.models.users;

public abstract class User {
    String name;
    String email;
    int age;

    public abstract void printUserName();

    public abstract void printUserLogin();

    public abstract void howOldAreYou();
}

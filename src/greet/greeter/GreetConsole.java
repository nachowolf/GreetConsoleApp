package greet.greeter;


import greet.user.User;

import java.util.Arrays;

public class GreetConsole implements GreetUser {




    @Override
    public String greet(String input) {
        String language;
        String user;
        String[] data = input.split(" ");
//        System.out.println;
        User createUser = new User(data[0]);
        user = data[0];
        System.out.println(user);
        return "Hello, " + user;
    }

    @Override
    public void setName(String name) {

    }

    @Override
    public void setLanguage(Language language) {


    }

    public static void main (String args []){

    }
}

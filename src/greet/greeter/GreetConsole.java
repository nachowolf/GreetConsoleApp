package greet.greeter;


import greet.user.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GreetConsole implements GreetUser {

List users = new ArrayList();


    @Override
    public String greet(String input) {
        String language;
        String user;
        String[] data = input.split(" ");
//        System.out.println;
        User createUser = new User(data[0].toString());
        users.add(createUser);
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

    @Override
    public String help() {
        Arrays.asList(GreetCommands.values()).forEach(command ->
                System.out.println(command));
        String commands = GreetCommands.values().toString();
return commands;
    }

    public static void main (String args []){
//     help();
    }
}

package greet.greeter;

public interface GreetUser {

   String greet(String input);
   void setName(String name);
   void setLanguage(Language language);
   String help();
   String[] greeted();


}

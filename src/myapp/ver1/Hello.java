package myapp.ver1;

import java.io.Console;

public class Hello {
    public static void main(String[] args){
        // Get the system console
        Console cons = System.console();

        // Read from the console, the result is assigned to a variable
        String name = ""; 
        
        while(name.trim().length() <= 0){
            cons.readLine("What is your name?");
        };

        // Use equals() for string comparison, == for numbers
        if(name.trim().equals("ode")){
            System.out.println("Hello ode");

        } else if (name.equals("")){
            System.out.println("Error, please enter your name");

        } else if(name.trim().equals("Barney")){
            System.out.println("Hello barney");

        }else {
            // Send a greeting to the name with a formatted string
            System.out.printf("Hello %s. Nice to meet you\n", name);
        }

    }
}

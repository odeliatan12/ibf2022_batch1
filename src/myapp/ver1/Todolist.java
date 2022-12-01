package myapp.ver1;

import java.io.Console;
import java.util.LinkedList;
import java.util.List;

public class Todolist {
    public static void main(String[] args){

        // Create a list of numbers
        List<Integer> listofInt = new LinkedList<>();

        // Get the console
        Console cons = System.console();

        String item = "";

        while (true){
            item = cons.readLine("Please enter a number");
            item = item.trim();

            if(item.equals("stop"))
                break;

            // Add the integer to the list
            listofInt.add(Integer.parseInt(item));
        }
        System.out.printf("Number of elements in the lis: %d\n", listofInt.size());
        for(int i = 0; i < listofInt.size(); i++){
            System.out.println(listofInt.get(i));
        }
    }
}

package myapp.ver1;

public class Todo {
    public static void main(String[] args){

        // Create an array of 3 string elements
        String[] tasks = new String[3];

        tasks[0] = "running";
        tasks[1] = "eating";
        tasks[2] = "sleeping";

        int index = 0;
        while(index < tasks.length){
            String value = tasks[index];
            System.out.println(value);
            index++;
        }
    }
}

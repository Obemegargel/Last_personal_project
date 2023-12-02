import java.util.ArrayList;
import java.util.Scanner;

public class javaproj {
    public static void main(String[] args) {
        //Create the ArrayList
        ArrayList<String> myArray = new ArrayList<>();
        typeswapper typeswap = new typeswapper();
        // Call a method in ClassB
        // bInstance.methodInClassB();
        greetings(myArray, typeswap);
        // display(myArray);
    }

    private static void greetings(ArrayList<String> myArray, typeswapper typeswap) {
        
        // typeswapper typeswap = new typeswapper();

        System.out.println("________________________________________________");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello, please type 'add', 'remove', 'display', 'math' or 'done'");
        while (true) {
            String decide = scanner.nextLine();
            if (decide.equalsIgnoreCase("done")) {
                break;
            }
            if (decide.equalsIgnoreCase("add")) {
                System.out.println("What text should we add to the array?:");
                String add = scanner.nextLine();
                // if (add.equalsIgnoreCase("mathArray")){
                    
                // }
                addtoarraylist(myArray, add);
                greetings(myArray, typeswap);//greetings(myArray)
            }
            if (decide.equalsIgnoreCase("remove")) {
                System.out.println("What text should we remove from the array?:");
                String remove = scanner.nextLine();
                removefromarraylist(myArray, remove);
                greetings(myArray, typeswap);//greetings(myArray)
            }
            if (decide.equalsIgnoreCase("math")) {
                System.out.println("What integer should we count up to while multiplying each number as we go?:");
                String math = scanner.nextLine();
                // math is passed to a function that changes it from text to an int.
                // Then that new value is passed into the mathfunction
                
                mathfunction(typeswap.stringtoint(math), typeswap);//stringtoint(math) //typeswap.stringtoint(math)
                greetings(myArray, typeswap);//greetings(myArray)
            }
            if (decide.equalsIgnoreCase("display")) {
                System.out.println("________________________________________________");
                // System.out.println("Display mathArray or myArray?:");
                // String whichArray = scanner.nextLine();
                // if (whichArray.equalsIgnoreCase("mathArray")) {
                //     display(mathstringArray);
                // }
                // else {
                //     display(myArray);//enter scanner to close that variable if bugs occur.
                // }
                display(myArray);//enter scanner to close that variable if bugs occur.
                greetings(myArray, typeswap);//greetings(myArray)
            }
            else {
                System.out.println("your answer was not one of the possible options.");
                System.out.println("Please type 'add', 'remove', 'display' or 'done'");
            }
        }
    }
    
    private static void addtoarraylist(ArrayList<String> myArray, String input) {
        myArray.add(input);
    }

    // private static void addtoarrayint(ArrayList<Integer> myArray, int input) {
    //     myArray.add(input);
    // }
    
    private static void removefromarraylist(ArrayList<String> myArray, String input) {
        myArray.remove(input);
    }

    // private static int stringtoint(String input) {
    //     int inputint = Integer.parseInt(input);
    //     return inputint;
    // }
    // private static String inttostring(int input) {
    //     String inputstring = String.valueOf(input);
    //     return inputstring;
    // }

    private static void mathfunction(int input, typeswapper typeswap) {
        ArrayList<String> mathstringArray = new ArrayList<>();
        int count = 1;
        int newvalue = 1;
        while (count <= input) {
            newvalue *= count;
            // concatarraytostring(mathstringArray, inttostring(count));
            addtoarraylist(mathstringArray, typeswap.inttostring(count) + "*");//inttostring(count) + "*");
            count++;
        }
        // concatarraytostring(mathstringArray, inttostring(newvalue));
        addtoarraylist(mathstringArray, " = " + typeswap.inttostring(newvalue));//inttostring(newvalue));
        display(mathstringArray);
        // addtoarraylist(mathArray, inttostring(count));
        // addtoarrayint(mathArray, newvalue);

    }

    // private static void concatarraytostring(ArrayList<String> myArray, String word) {
    //     // System.out.println("The text at index 1: " + myArray.get(1));

    //     System.out.println("Elements in the ArrayList:");
    //     for (String item : myArray) {
    //         System.out.println(item);
    //     }

    //     System.out.println("Size of myArray: " + myArray.size());

    // }

    // private static void displaystring(String word) {
    //     System.out.println(word);
    // }

    private static void display(ArrayList<String> myArray) {
        // System.out.println("The text at index 1: " + myArray.get(1));

        System.out.println("Elements in the ArrayList:");
        for (String item : myArray) {
            System.out.println(item);
        }

        System.out.println("Size of myArray: " + myArray.size());
    }
}

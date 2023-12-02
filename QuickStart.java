//Variables done
//Expressions done
//Conditionals
//Loops
//Functions
//Classes
//Data structure from Java Collection Framework (such as ArrayList, TreeSet, or HashMap)

public class QuickStart {
    public static void main(String[] args ) {
        System.out.println("Hello World.");
        System.out.println("Hello Worldy.");
        System.out.print("Hello Worldling.");
        System.out.println("Hello Worldify.");
        System.out.println(9 + 3 * 8 / 13); // expression
        // practicing commenting
        int intvar = 0; // create a variable
        System.out.println(intvar);

        String text;
        text = "words I write";// expression
        System.out.println(text);

        final int intfinalvariableexample = 7;
        // intfinalvariableexample = 20 would not work
        System.out.println(intfinalvariableexample);

        // intro to if statements
        int a = 7;
        int b = 8;
        if (a > b) {
            System.out.println("a: " + a + " is bigger than " + "b: " + b);
        } else if (a < b) {
            System.out.println("b: " + b + " is bigger than " + "a: " + a);
        } else {
            System.out.println("b: " + b + " is equal to " + "a: " + a);
        }

        // intro to if statements made on one line
        boolean booly = false;
        String result = (booly) ? "Good day." : "Good evening.";
        System.out.println(result);

        // continue with statrments made on one line
        // variable = (condition) ? expressionTrue :  expressionFalse;
        int time1 = 20;
        if (time1 < 18){
        System.out.println("Good day.");
        }
        else{
            System.out.println("Good evening.");
        }
        
        int time2 = 20;
        String result2 = (time2 < 18) ? "Good day." : "Good evening.";
        System.out.println(result2);


        
    }
}

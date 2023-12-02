import java.util.ArrayList;
import java.util.Scanner;

public class timecalculator {
    public static void main(String[] args) {
        ArrayList<String> historyarray = new ArrayList<>();
        typeswapper typeswap = new typeswapper();
        greetings(historyarray, typeswap);
    }

    public static void greetings(ArrayList<String> historyarray, typeswapper typeswap) {
        //universal arrays
        
        System.out.println("________________________________________________");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please select one:");
        System.out.println("add: type 'add'");
        System.out.println("subtract: type 'sub'");
        System.out.println("done: type 'done'");
        while (true) {
            String decide = scanner.nextLine();
            if (decide.equalsIgnoreCase("add")) {
                System.out.println("Adding dates or times?");
                String dateortime = scanner.nextLine();

                if (dateortime.equalsIgnoreCase("times")) {
                    System.out.println("AM or PM? (midnight is AM, Noon is PM)");
                    String AMorPM = scanner.nextLine();
                    System.out.println("What is your first time? ex. 12:01, type 'prev' if previous time used.");
                    String time = scanner.nextLine();

                    if (time.equalsIgnoreCase("prev")) {
                        // System.out.println("testing");
                        displaystring(time);
                        // greetings();
                    }

                    else {
                        // Else send the text ex. 12:01 and AM or PM to get turned into useful data
                        //split the string in two parts divided by the ":"
                        // Then put that answer in splitstringtoints function.
                        splitstringtoints(historyarray, typeswap, scanner, splittime(time), AMorPM);
                        
                    }
                }
                if (dateortime.equalsIgnoreCase("dates")) {

                }

                // String whatadd = scanner.nextLine();
            }
            if (decide.equalsIgnoreCase("subtract")) {

            }
            if (decide.equalsIgnoreCase("done")) {

            }
            else {
                System.out.println();
                System.out.println("I am sorry, that is not one of the options.");
                greetings(historyarray, typeswap);
            }
        }
    }
    
    private static int add(int sec1, int sec2) {
        int totalsec = sec1 + sec2;
        return totalsec;
    }

    private static int convertsectominute(int sec) {
        int sectomin = 0;
        if (sec < 60) {
            sectomin = sec;
        } else {
            sectomin = sec / 60;
        }
        return sectomin;
    }

    private static String[] splittime(String time) {
        String[] splitstring = time.split(":");
        return splitstring;
    }
    
    private static void splitstringtoints(ArrayList<String> historyarray, typeswapper typeswap, Scanner scanner, String[] split, String AMorPM) {
        String firsthalf = split[0];
        String secondhalf = split[1];
        // Integer firstint = typeswap.stringtoint(firsthalf);
        // Integer secondint = typeswap.stringtoint(secondhalf);

        checktime(historyarray, typeswap, scanner, firsthalf, secondhalf, AMorPM);
        // displayint(typeswap.stringtoint(firsthalf));
    }
    
    private static void checktime(ArrayList<String> historyarray, typeswapper typeswap, Scanner scanner, String firsthalf,
            String secondhalf, String AMorPM) {
        // This keeps track of the times entered in a history array
        //This will add times to an array called historyarray
        Integer firstint = typeswap.stringtoint(firsthalf);
        Integer secondint = typeswap.stringtoint(secondhalf);
        if (firstint > 24) {
            System.out.println("I am sorry " + firstint + " is larger than 24. please add an hour between 1 and 24");
            greetings(historyarray, typeswap);
        }
        if (secondint > 60) {
            System.out.println("I am sorry " + secondint + " is larger than 60. Please add an hour between 0 and 60");
            greetings(historyarray, typeswap);
        }

        if (AMorPM.equalsIgnoreCase("pm")) {
            if (firstint < 12) {
                firstint += 12;//convert to military time if not already
            }
        }
        if (AMorPM.equalsIgnoreCase("am")) {
            if (firstint > 12) {
                System.out.println("I am sorry " + firstint
                        + " is larger than 12. Because you said it was AM please add an hour between 0 and 12 if you want retry this number again.");
                greetings(historyarray, typeswap);
            }
        } else {
            getnexttime(historyarray, typeswap, scanner, firstint, secondint, AMorPM);
        }

    }
    
    private static void getnexttime(ArrayList<String> historyarray, typeswapper typeswap, Scanner scanner, Integer firstint, Integer secondint, String AMorPM) {
        // This keeps track of the times entered in a history array
        //This will add times to an array called historyarray
        System.out.println("Your first time is" + firstint + ":" + secondint + " " + AMorPM);
        System.out.println("Will your second time be AM or PM?");
        String AMorPMprt2 = scanner.nextLine();
        System.out.println("What will your second time be?");
        String secondtime = scanner.nextLine();
        splitstringtoints(historyarray, typeswap, scanner, splittime(secondtime), AMorPM);// make this function more universal. Instead of calling getnexttime() in splitstringtoints call it in a different function.
    }

    private static void addhistoryarray() {
        // This keeps track of the times entered in a history array
        //This will add times to an array called historyarray

    }
    private static void removehistoryarray() {
        // This keeps track of the times entered in a history array
        //This will add times to an array called historyarray

    }

    private static void displayarraystring(ArrayList<String> array) {
        //This will display all the values in an array
        for (String part : array) {
            System.out.println(part);
        }
        // If it is not
    }
    private static void displaystringboxbrackets(String[] word) {
        //This will display all the values in an array
        System.out.println(word);
        // If it is not
    }
    private static void displaystring(String word) {
        //This will display all the values in an array
        System.out.println(word);
        // If it is not
    }

    private static void displayint(Integer word) {
        //This will display all the values in an array
        System.out.println(word);
        // If it is not
    }

}

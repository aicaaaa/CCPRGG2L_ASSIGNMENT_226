import java.util.Scanner;



public class exercise2{



    static Scanner scan = new Scanner(System.in);



    public static void main(String[] args) throws Exception {



        test("Driving Lessons");

        scan.close();

    }



    static void test(String driving) {



        System.out.println("Driving Lesson");

        TakeAgain(driving);



        String reply = getreply(driving);



        // Define the base case / stopping condition

        if (reply.equals("no")) {



            // Do something to reach the goal

            Improvement(driving);



            // Recursive call

            test(driving);

        } else if (reply.equals("yes")) {

            lesson(driving);

        }

    }



    static void TakeAgain(String driving) {

        System.out.println("Test Drive");

    }



    static String getreply(String driving) {

        System.out.println("Is the " + driving + " successful "+" ? (Enter \"yes\" or \"no\")");



        String reply = scan.next();



        return reply;

    }



    static void Improvement(String driving) {

        System.out.print("What skills do you want to improve?:");

        String test = scan.next();

        System.out.println("Fixing driving skills. Added " + test);

    }



    static void lesson(String driving) {

        System.out.println("Successful " + driving);

    }



}



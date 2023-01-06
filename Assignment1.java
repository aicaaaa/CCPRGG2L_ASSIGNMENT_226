import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter school email: ");
        String schoolemail = scan.nextLine();

        Pattern pattern = Pattern.compile("\\w{1,}@students.national-u.edu.ph");
        Matcher matcher = pattern.matcher(schoolemail);

        boolean match = matcher.matches();

        if (match) {
            System.out.println("valid student email");
        } else {
            System.out.println("invalid student email");
        }

        System.out.print("Enter number: ");
        String phonenumber = scan.nextLine();

        pattern = Pattern.compile("\\+63\\d{10}");
        matcher = pattern.matcher(phonenumber);

        boolean match2 = matcher.matches();

        if (match) {
            System.out.println("valid phone number");
        } else {
            System.out.println("invalid phone number");
        }
        System.out.print("Enter birthdate: ");
        String birthdate = scan.nextLine();

        pattern = Pattern.compile("\\d{4}-\\d{2}-\\d{2}");
        matcher = pattern.matcher(birthdate);

        boolean match3 = matcher.matches();

        if (match3) {
            System.out.println("valid birthdate");
        } else {
            System.out.println("invalid birthdate");
        }

    }
}

       
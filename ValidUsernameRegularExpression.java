import java.util.Scanner;

public class ValidUsernameRegularExpression {

    //Problem: https://www.hackerrank.com/challenges/valid-username-checker/problem
    private static final Scanner scan = new Scanner(System.in);
    
    public static void main(String[] args) {
        int n = Integer.parseInt(scan.nextLine());
        while (n-- != 0) {
            String userName = scan.nextLine();

            if (userName.matches(UsernameValidator.regularExpression)) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }           
        }
    }
}

class UsernameValidator {
public static final String regularExpression = "^[[A-Z][a-z]][[A-Za-z0-9_]]{7,29}$";
}

/*

^                       # Start of the line
   [A-Z][a-z]]          # First character will be A-z  --> uppercase  a-z --> lowercase
   [[A-Za-z0-9_]]       # Rest of the word can contains A-z, a-z, 0-9, underscore
    {7,29}              # Length at least 8 characters and maximum length of 30 (we add first character to total)
$                       # End of the line

*/
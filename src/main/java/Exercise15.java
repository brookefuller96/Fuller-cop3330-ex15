import java.util.Scanner;
import java.lang.*;
import static java.lang.System.*;

public class Exercise15 {
    public static void main(String[] args) {
        System.out.println("What is the password? ");
        Scanner input = new Scanner(in);
        String str1 = input.nextLine();
        String str2 = "12345";
        if (str2.equalsIgnoreCase(str1) == true)
        {
            System.out.println("Welcome!");
        }
        else
        {
            System.out.println("I don't know you");
        }
    }
}
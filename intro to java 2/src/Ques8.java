/*WAP to read words from the keyboard until the word done is entered. For each word except done, report whether its first character is equal   to  its last character. For the required loop, use a
        a)while statement
        b)do-while statement*/
import java.util.Scanner;

public class Ques8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String str = sc.next();

        while (!str.equals("done")) {
            if (str.charAt(0) == str.charAt(str.length() - 1)) {
                System.out.println("First and last character of " + str + " is equal");
            } else {
                System.out.println("First and last character of " + str + " is not equal");
            }
            System.out.println(" ");
            System.out.print("Enter a word again or type done to quit : ");
            str = sc.next();
        }

        /*do {
                if(str.charAt(0) == str.charAt(str.length()-1))
                {
                    System.out.println("First and last character of "+str+" is equal");
                }
                else
                {
                    System.out.println("First and last character of "+str+" is not equal");
                }
                System.out.println(" ");
                System.out.printf("Enter a word again or type done to quit : ");
                str = sc.next();

        }while(!str.equals("done")); */
    }
}

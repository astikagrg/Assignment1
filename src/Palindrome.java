import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //data representation
        String word, rev;


        //input values
        System.out.println("Enter the word:");
        word = scan.nextLine();


        rev = " ";
        int length = word.length();
        System.out.println(length);

        for (int i = (length - 1); i >= 0; i--) {
            rev = rev + word.charAt(i);
        }
        System.out.println(rev);

        if (word.equals(rev))
            System.out.println("Palindrome.");

        else
            System.out.println("Non-Palindrome.");


    }
}
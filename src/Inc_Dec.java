import java.util.Scanner;

public class Inc_Dec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter a number: ");
        int n_one = sc.nextInt();
        System.out.println(" Enter a number: ");
        int n_two = sc.nextInt();
        System.out.println(" Enter a number: ");
        int n_three = sc.nextInt();

        String ans=order(n_one, n_two, n_three);
        System.out.println(ans);


    }

    public static String order(int n_one, int n_two, int n_three) {
    String a;
        if (n_one > n_two && n_two > n_three)
             a="descending";
        else if (n_one<n_two && n_two<n_three)
            a="ascending order";
        else
            a="neither ascending nor descending";
    return a;
    }
}

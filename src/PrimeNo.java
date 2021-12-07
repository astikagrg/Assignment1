import java.util.Scanner;

public class PrimeNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Enter a number");
        num = sc.nextInt();
        prime(num);

    }

    public static void prime(int num) {

        for (int i = 2; i <= num; i++) {
            int k = 0;

            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    k = k + 1;
                }
            }

            if (k <= 2) {
                System.out.println(i);
            }

        }
    }
}



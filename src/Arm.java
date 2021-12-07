//Write a java program to check whether a given number is Armstrong number or not.
// Note: An Armstrong number of a three-digit number is a number in which the sum of the cube of the
//digits is equal to the number itself. Hence 153 is an Armstrong number

import java.util.Scanner;
public class Arm {
    public static void main(String[] args) {
        int newNo, remainder;
        int result =  0 ;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number" );
        int num = sc.nextInt();
        int n = String.valueOf(num).length();
        System.out.println("Length of entered number " + n);
        newNo = num;
        while (newNo > 0 ){
            remainder = newNo % 10 ;
            result += Math.pow(remainder, n);
            newNo = newNo / 10 ;
        }
        if (num == result){
            System.out.println(num + "is Armstrong");
        }
        else {
            System.out.println(num + " is not an armstrong");
        }

    }

}
//Write a Java program that accepts two floating-point numbers and checks whether they are the same
//up to two decimal places.


import java.util.Scanner;
public class LastDec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        float fnum1 = sc.nextFloat();
        System.out.println("enter the second number:");
        float fnum2 = sc.nextFloat();

        if (Math.abs(fnum1 - fnum2) <= 0.01){
            System.out.println("Numbers are same");
        }
        else{
            System.out.println("Numbers are different ");
        }

    }

}

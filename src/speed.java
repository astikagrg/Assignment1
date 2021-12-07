//Write a Java program to takes the user for a distance (in meters) and the time was taken(as three
//numbers: hours, minutes, seconds), and display the speed, in meters per second, kilometers per hour
//and miles per hour (hint: 1 mile = 1609 meters).Example
//Input distance in meters: 2500
//Input hour:5
//Input minutes: 56
//Input seconds: 23
//Expected Output:Your speed in meters/second is 0.11691531.
//Your speed in km/h is 0.42089513Your speed in miles/h is 0.26158804import jdk.swing.interop.SwingInterOpUtils;

import java.sql.SQLOutput;
import java.util.Scanner;


public class speed {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter distance in metre: ");
        float dist = sc.nextFloat();
        System.out.println(" Enter time in hours: ");
        float hour = sc.nextFloat();
        System.out.println(" Enter time in min: ");
        float min = sc.nextFloat();
        System.out.println(" Enter time in sec: ");
        float sec = sc.nextFloat();


        sp(dist, hour, min, sec);




    }

    public static void sp(float dist, float hour,float min, float sec) {
        float mps, kph, mph;
        float totaltime=hour*3600+min*60+sec;
        float km= dist/ 1000;

        mps= dist/totaltime;
        kph= km/ (totaltime/3600);
        mph= (dist/1609)/(totaltime/3600);

        System.out.println(" Speed in meter per sec " +  mps);
        System.out.println(" Speed in km per hr "+ kph);
        System.out.println(" Speed in miles per hour is "+ mph);

    }
}



import java.util.Scanner;


    public class BMI {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println(" Enter a wt: ");
            float weight = sc.nextFloat();
            System.out.println(" Enter a height: ");
            float height = sc.nextFloat();


            float ans=bm(weight, height);
            System.out.println("BMI ; " + ans);



        }

        public static float bm(float weight, float height) {
            return weight/(height*height);
        }
    }



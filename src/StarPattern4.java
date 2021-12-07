public class StarPattern4
{
    public static void main(String[] args) {
        String as="*";
        for(int i=5;i>0 ;i--)
        {
            for(int j=0;j<5-i;j++)

            {
                System.out.print(" ");
            }
            for(int j=0;j<(i*2)-1;j++)

            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

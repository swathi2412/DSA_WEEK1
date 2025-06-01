import java.util.Scanner;
public class prob6 {
     public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.println("enter the  value of x");
        int x = scan.nextInt();
         for(int i=x;i<=1000;i=i+100)
        {
             System.out.println(i);
        }
    }
}

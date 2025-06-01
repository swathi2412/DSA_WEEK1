import java.util.Scanner;
public class prob7 {

       public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.println("enter the firstname");
        String firstName = scan.next();
        System.out.println("enter the lastname");
        String lastName = scan.next();
        System.out.println("enter the  value of n");
        int n = scan.nextInt();
        String fullName = firstName + lastName;
        for(int i=1;i<=n;i++)
        {
            System.out.println(fullName);
        }
       }


    
}

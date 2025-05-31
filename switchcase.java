import java.util.Scanner;
public class prob4 {
     public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.println("enter the  size");
        int size = scan.nextInt();
        switch(size){
            case 29 :
                System.out.println("small");
                break;

            case 30 :
                System.out.println("medium");
                break;
            case 38 :
                 System.out.println("large");
                 break;
            case 42 :
                 System.out.println("Xlarge");
                 break;
            default :
                 System.out.println("invalid");
                 
        }

     }
}

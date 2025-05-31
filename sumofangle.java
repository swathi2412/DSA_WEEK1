import java.util.Scanner;
public class prob2 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.println("enter first angle of triangle");
        int firstAngle = scan.nextInt();
        System.out.println("enter second angle of triangle");
        int secondAngle = scan.nextInt();
        System.out.println("enter third angle of triangle");
        int thirdAngle = scan.nextInt();
        int sumOfAngle= firstAngle+secondAngle+thirdAngle;
        if(sumOfAngle == 180){
            System.out.println("triangle can be formed");
        }
        else{
            System.out.println("triangle cannot be formed");
        }
        
        



    }
    
}

import java.util.Scanner;
public class prob3 {
        public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.println("enter mark of the student");
        int mark= scan.nextInt();
        if(mark>=90)
        {
            System.out.println("grade A");
        }
        else if(mark>=80)
        {
             System.out.println("grade B");
        }
        else if(mark>=60){
             System.out.println("grade C");
        }
        else if(mark>=35){
             System.out.println("grade D");
        }
        else{
             System.out.println("fail");
        }
        }
        
    
}

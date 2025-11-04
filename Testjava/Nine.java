
import java.util.Scanner;
public class Nine {
    public static void main(String []args) {


        System.out.println("Enter the value of a");

     Scanner obj= new Scanner(System.in);
     int a= obj.nextInt();

       for(int i=1; i<=10; i++) {
        System.out.println(a*i);
       }
    
    }
}
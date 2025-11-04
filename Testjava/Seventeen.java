import java.util.Scanner;


public class Seventeen {
    public static void main(String []args) {
      
      Scanner obj = new Scanner(System.in);
        
        System.out.println("Enter the value of a");
        int a= obj.nextInt();


         System.out.println("Enter the value of b");
         int b=obj.nextInt();



        System.out.println("Enter the value of c");
        int c=obj.nextInt();


        if(a>b && a>c) {
            System.out.println("A is Greater");
        }

        else if (b>a && b>c) {
            System.out.println("B is greater");
        }

        else {
            System.out.println("C is greater");
        }
    }
}
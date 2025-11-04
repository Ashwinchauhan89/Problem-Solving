import java.util.Scanner;
public class Eighteen {
    public static void main(String []args ) {

      Scanner obj =new Scanner(System.in);

        int a; 
        int b;
        int ch;

        System.out.println("Enter the value of a");
        a=obj.nextInt();

        System.out.println("Enter the value of b");
        b=obj.nextInt();


        System.out.println("Enter the value of Choiceee");
        ch=obj.nextInt();


        int sum=a+b;
        int sub=a-b;
        int mul=a*b;
        int div=a/b;
        int mod= a%b;


        switch(ch) {
         
         case 1: 
         System.out.println(sum);
         break;


         case 2: 
         System.out.println(sub);
         break;


         case 3: 
         System.out.println(mul);
         break;


         case 4 : 
         System.out.println(div);
         break;



         case 5: 
         System.out.println(mod);
         break;

         default: 
         System.out.println("Exit");



        }


}
}
import java.util.Scanner;
public class Factorial {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        int i;
        int f=1;
        System.out.println("Enter any Number");
        int num = sc.nextInt();
        for(i=1; i<=num; i++) 
        {
            f = f*i;
        }
        System.out.println("Factorial of "+ num + " is : "+f );
    }
}
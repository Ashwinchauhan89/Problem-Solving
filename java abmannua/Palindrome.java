import java.util.Scanner;
public class Palindrome {
    public static void main(String []args) {
       int n;
       int s=0;
       int c;
       int r;
       System.out.print("Enter the number :");
       Scanner ref= new Scanner(System.in);
       n=ref.nextInt();
       c=n;

       while(n>0) {
        r=n%10;
        s=(s*10)+r;
        n=n/10;
       }

       if(c==s) {
        System.out.println("Number is Palindrome");
       }
        else {
            System.out.println("Not Palindrome");
        }
       
    }
}
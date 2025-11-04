class Overloading {
    int Ds(int a,int b) {
        return a+b;
    }

    int Ds(int a,int b, int c) {
        return a+b+c;
    }

    int Ds(int a,int b, int c, int d) {
        return a+b+c+d;
    }

       
    
}

public class Polymorphism {
    public static void main(String []args)  {
        Overloading obj = new Overloading();
        System.out.println("The sum of a and b : "+obj.Ds(10,20));

        System.out.println("The sum is a,b and c : "+obj.Ds(10,20,30));

        System.out.println("The sum is a,b,c and d : "+obj.Ds(10,20,30,40));

       
    }
}
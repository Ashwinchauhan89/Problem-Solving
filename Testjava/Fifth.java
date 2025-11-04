class Overloading {    



    int Add (int a, int b)
     {
        return a+b;
    }

    int Add (int a, int b, int c)
     {
        return a+b+c;
    }
    
    int Add (int a, int b ,int c,int d)
     {
        return a+b+c+d;
    }

}





public class Fifth {
    public static void main(String []args) {


Overloading obj =new Overloading();


System.out.println(obj.Add(10,20));

System.out.println(obj.Add(10,20,30));

System.out.println(obj.Add(10,20,30,40));
    }
}
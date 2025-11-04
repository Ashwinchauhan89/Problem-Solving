class Parent {
    int sub(int a, int b) {
       return a-b;

    }
}

class Child extends Parent {
    int sub(int a, int b, int c) {
        return a-b-c;
        
    }
}

public class Overriding {
    public static void main(String []args) {
        Child obj = new Child ();
       System.out.println(obj.sub(12,20));
       System.out.println(obj.sub(90,45,35));
    }
}

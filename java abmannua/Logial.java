class Parent {
    void display() {
        System.out.println ("Parent class Method");

    }
}

class Child extends Parent {
    void display() {  //override method
        System.out.println ("Child class Method");
        
    }
}

public class Logial {
    public static void main(String []args) {
        Parent  p = new Parent ();
        p.display();
       Parent  c = new Child (); 
        c.display();
    }
}

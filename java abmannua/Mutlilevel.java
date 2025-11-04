class Base {
    void base() {
        System.out.println("Here it is my Base Class");
    }
}

class Intermediate extends Base {
    void intermediate() {
        System.out.println("Here it is my Intermediate class");
    }
}

class Derived extends Intermediate {
    void derived() {
        System.out.println("Here it is my Derived Class ");
    }
}

public class Mutlilevel {
public static void main(String []args) {
    Derived obj = new Derived();

    obj.derived();
    obj.intermediate();
    obj.base();
}
}
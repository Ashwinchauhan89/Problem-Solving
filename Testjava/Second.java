class Base {
    void base() {
        System.out.println("Here its my base class");
    }
}

class Derivied extends Base {
    void derivied() {
        System.out.println("Here its my derivied classs");
    }
}


public class Second {
    public static void main(String []args) {

        Derivied obj = new Derivied();

        obj.base();
        obj.derivied();

    }
}
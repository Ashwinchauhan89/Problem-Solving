class Base {
    void base() {
     System.out.println("Hre its my base class");
    }
}

class Child1 extends Base {
    void child1() {

    System.out.println("Here its my child 1");
    }
}


class Child2 extends Base {
    void child2() {

        System.out.println(" here its  child 2");
    }
}


public class Fourth {
    public static void main(String []args) {
        Child1 obj1 =new Child1();
        obj1.child1();
        obj1.base();


          Child2 obj2 =new Child2();
        obj2.child2();
        obj2.base();


    }
}
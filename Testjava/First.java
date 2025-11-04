class thread1 extends Thread {
    void base() {
        System.out.println("hello");
    } 
}

class thread2 extends Thread {
    void child() {
        System.out.println("i am Ashwin Chauhan ");
    }
}

public class First {
    public static void main(String []args) {
        thread1 obj1 = new thread1();
        obj1.base();
         thread2 obj2 = new thread2();
        obj2.child();
    }
}
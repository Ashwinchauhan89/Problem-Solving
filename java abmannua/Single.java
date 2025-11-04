class Parent {
    void parent() {
        System.out.println("Here its my Parent Class");
    }
}
class Child extends Parent {
    void child() {
        System.out.println("Here its my Child class");
    }
}
public class Single {
public static void main(String []args) {
    Child obj=new Child();
    obj.child();
    obj.parent();

}
}

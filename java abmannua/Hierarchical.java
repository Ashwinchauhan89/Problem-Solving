class Parent {
    void parent() {
        System.out.println("Parent Class have Two equally Childs Classes ");
    }
}
class Child1 extends Parent {
    void child1() {
        System.out.println("Here it is my Child 1 class");
    }
}
class Child2 extends Parent {
    void child2() {
        System.out.println("Here it is my Child 2 class");
    }
}
public class Hierarchical {
public static void main(String []args) {
    Child1 obj1=new Child1();
    obj1.child1();
    
     Child2 obj2=new Child2();
    obj2.child2();
    

}
}

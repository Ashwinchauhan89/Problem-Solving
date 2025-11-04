public class Main {
    
     String name;
     int age;
     int rollNo;

     public Main() { //constructor
        name="Ashwin Chauhan";
        age =19;
        rollNo =10;
     }

    public static void main(String []args) {
        Main obj= new Main();
        System.out.println("Name : "+obj.name);
        System.out.println("Age : "+obj.age);
        System.out.println("Roll No. : "+obj.rollNo);
     
    }

}
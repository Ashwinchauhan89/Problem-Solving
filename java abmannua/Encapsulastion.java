
/*public class Demo {
    private String name;

    public Demo(String name) {
      this.name=name;
    }
    //get the name
    public String getName() {
       return name;
    }

    //set the name 
    public String setName() {
        this.name=name;
    }
}

public class Encapsulation {
    public static void main(String []args) {
        Demo p = new Demo("Abhisekh");
        System.out.println("Name is :"+p.getName());

        p.setName("Ashwin");
        System.out.println("Update Name :"+p.getName());
    }

} */

class Demo {
    private String name;

    public Demo(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class Encapsulastion {
    public static void main(String[] args) {
        Demo p = new Demo("Abhisekh");
        System.out.println("Name is: " + p.getName());

        p.setName("Ashwin");
        System.out.println("Updated Name: " + p.getName());
    }
}

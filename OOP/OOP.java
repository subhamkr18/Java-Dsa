package OOP;

class Pen{
    String colour;
    String type;

    public void write(){
        System.out.println("Write Something");
    }

    public void printColour(){
        System.out.println(this.colour);
    }
}

class Student{
    String name;
    int age;

    public void printInfo(){
        System.out.println("Name: "+this.name);
        System.out.println("age: "+this.age);
    }
}

public class OOP {
    public static void main(String[] args) {
        Pen pen1 = new Pen();
        pen1.colour = "Blue";
        pen1.type= "Gel";

        Pen pen2 = new Pen();
        pen2.colour = "Black";
        pen2.type = "ballpoint";

        pen1.printColour();
        pen2.printColour();
        pen1.write();

        Student s1 = new Student();
        s1.name = "Subham";
        s1.age = 20;
        s1.printInfo();
    }
    
}

package OOP;

class Student{
    String name;
    int age;

    public void printInfo(){
        System.out.println("Name: " + this.name);
        System.out.println("age: " + this.age);
    }

    Student(){
        System.out.println("Constructor called");
    }
}

public class ConstructorDemo {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "subham"; 
        s1.age = 20;

        s1.printInfo();
    }
}

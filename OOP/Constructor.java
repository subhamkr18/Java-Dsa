package OOP;

public class Constructor {
    public static void main(String[] args) {
       Student s1= new Student(20);
       Student s2= new Student(59,21);
       s1.print();
       s2.print();
    }
}
// example of constructor overloading
class Student{
    int a;
    int b;
// making constructor with same name and different parameter- constructor overloading
    public Student(int ID){
        this.a=ID;
        b=20;
    }

    public Student(int ID,int Age){
        this.a=ID;
        this.b=Age;

    }

    void print(){
        System.out.println("Student ID: "+a+" age: "+b);
    }
}

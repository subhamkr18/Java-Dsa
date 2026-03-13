package OOP;

public class Myclass {
    public static void main(String[] args) {
        Dog d1= new Dog();
        d1.name= "Tommy";
        d1.walk();

        Dog d2 = new Dog();
        d2.name="Leo";
        d2.bark();

    }
   
}
 class Dog{
        String name;
        int age;

        void walk(){
            System.out.println(name+"is walking");
        }

        void bark(){
            System.out.println(name+" is barking");
        }
    }
// class is a vertual entity and object is is physical entity
// for a same class we can create multiple object
// class - is a entity which is linked to propertiy and entity
// class is not allocated in memory object is allocated in memory

package OOP;

public class MethodOverloading {
    public static void main(String[] args) {
        Greet g = new Greet();
        g.greetings();
        g.greetings("Subham");
        g.greetings("Subham",5);
    }
}
//method overloading 
class Greet{
    void greetings(){ //no parameter
        System.out.println("Hii, Good Mororning");
    }

    void greetings(String name){ //one paramenter
        System.out.println("Good Morning "+name);
    }

    void greetings(String name, int count){ // two parameter
        for(int i=0; i<count;i++){
            System.out.println("Good Morning "+name);
        }
    }
}
// creating same method with different parameter cause method overloading
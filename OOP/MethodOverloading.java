package OOP;

public class MethodOverloading {
    public static void main(String[] args) {
        Greet g = new Greet();
        g.greetings();
        g.greetings("Subham");
        g.greetings("Subham",5);
    }
}

class Greet{
    void greetings(){
        System.out.println("Hii, Good Mororning");
    }

    void greetings(String name){
        System.out.println("Good Morning "+name);
    }

    void greetings(String name, int count){
        for(int i=0; i<count;i++){
            System.out.println("Good Morning "+name);
        }
    }
}

package OOP;

class Pen{
    String colour;
    String type;

    public void write(){
        System.out.println("Write Something");
    }
}

public class OOP {
    public static void main(String[] args) {
        Pen pen1 = new Pen();
        pen1.colour = "Blue";
        pen1.type= "Gel";
        pen1.write();
    }
    
}

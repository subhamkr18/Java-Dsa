package Methods;

public class Arguments {
    public static void sum(int a, int b){//parameter
        System.out.println("Sum: "+a+b);
    }
    public static void main(String[] args) {
        sum(5,9);//arguments
        Max(77,88,109);
    }
    public static void Max(int a, int b, int c){
        if(a>=b && a>=c) System.out.print("Max: "+a);
        else if(b>=a && b>=c) System.out.print("Max: "+b);
        else System.out.print("Max: "+c);
    }
}

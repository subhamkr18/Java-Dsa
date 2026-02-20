package Methods;

public class MethodReturnType {
    public static int Subham(){
        System.out.println("I am Subham");
        return 5; // Subham() ki value return dega

    }

    public static int SK(int a){
        System.out.println("Sk");
        if(a>0) return 10;
        else return 0;
    }
    public static void main(String[] args) {
        
        int x= Subham(); // Subham() ek integer store hoga 5
        System.out.println("Subham value: "+x);
        int y= SK(7);
        System.out.println("sk: "+(3+y));
    }
}

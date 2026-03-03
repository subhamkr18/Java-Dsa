package Arrays;

public class PassingArraytoMethods {
    public static void change(int[] x){
        x[2]=99;
    }
    public static void main(String[] args) {
        int[] x={10,20,30,40,50};
        System.out.println("Array before  value change: "+x);
        System.out.println("2nd element before change: "+x[2]);
        change(x); // change value of 2nd index
        System.out.print("2nd element After chnge: "+x[2]);
    }
}

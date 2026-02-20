package Methods;

public class PassByvalueAndRefrence {
    public static void change(int x){
        x=10;
    }
    public static void main(String[] args) {
        int x= 6;
        System.out.println(x);
        change(x);// pass by value not refrece . x ki value sirf pass hue hai
        System.out.println(x);// x ka value still 6 hai
    }
}

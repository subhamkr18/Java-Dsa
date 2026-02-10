package Loops;
//Print all odd numbers divisible by 3from 1 to 100
public class OddNoDivisibleby3 {
    public static void main(String[] args) {
        
        // for(int i=1; i<100;i++){
        //     if(i%2 !=0 && i%3==0) System.out.print(i + " ");
        // }

        for(int i=3; i<100; i+=6) System.out.print(i+ " "); // less ittration
    }
}

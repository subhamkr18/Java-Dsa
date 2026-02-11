package Loops;
// series- 99,95,91,87,... upto all terms which are positive
public class Print_Ap {
   public static void main(String[] args) {
    int a=99;
    int d=-4;

    while(a>=0){
        System.out.print(a + " ");
        a = a +d;
    }

   } 
}

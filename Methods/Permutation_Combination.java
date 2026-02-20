package Methods;
import java.util.Scanner;
public class Permutation_Combination {
    public static int fact(int x){
        int f =1;
        for (int i=1;i<=x;i++){
            f *=i;
        }
        return f;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter n:");
        int n= sc.nextInt();
        System.out.print("Enter r: ");
        int r = sc.nextInt();

        //Using Method
        int ncr = fact(n)/(fact(r)*fact(n-r));
        System.out.print("ncr: "+ncr);
        /* 
        //Calculating Factorial
        int nFact=1;
        for(int i=1; i<=n;i++){
            nFact *=i;
        }

        int rFact=1;
        for(int i=1; i<=r;i++){
            rFact *=i;
        }

        int nrFact=1;
        for(int i=1; i<=n-r;i++){
            nrFact *=i;
        }
         int ncr = nFact/(rFact*nrFact);
         System.out.print("Ncr: "+ ncr);
      */
}
}

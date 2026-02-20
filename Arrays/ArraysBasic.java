package Arrays;

public class ArraysBasic {
    public static void main(String[] args) {
        // Array Initialization
        int[] x ={6,19,69,9,171,5};
        //Indexing of Array starts from 0 tolength -1
        System.out.println(x[0]); 
        //Updating elements - mutability
        x[3]=89;
        System.out.println(x[3]);

        // intialization of empty array
        int[] arr = new int[4]; //4 Size of Array
        arr[0] =10;
        arr[1] =20;
        arr[2] =150;
        arr[3] =-8;
        for(int i=0; i<=3;i++)
        System.out.print(" "+arr[i]);
    }
}

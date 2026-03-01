package Arrays;

public class MultiplyOddindexby2andEvanaddby10 {
    public static void main(String[] args) {
        int[] arr={10,20,30,40,50,60};
        for(int i=0; i<arr.length;i++){
            //checking even index and adding 10 into that
            if(i%2==0){
                arr[i] +=10;
                System.out.print(arr[i]+" ");
            }
            else{
                //this will check odd index and multiply element by 2
                arr[i] *=2;
                System.out.print(arr[i]+" ");
            }
        }
        
    }
}

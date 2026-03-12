package Mid_Sem.Stack_;
import java.util.Scanner;
class stack
{
    Scanner sc = new Scanner(System.in);   
    int top =-1;
    int n=10;
    int a[]=new int[n];
    void push(){
        if(top==n-1){
            System.out.print("Overflow");
        }
        else{
            System.out.print("Enter element: ");
            int i =sc.nextInt();
            top=top+1;
            a[top]=i;
            System.out.println("item inserted");
        }
    }
        void pop()
        {
            if(top==-1)
            {
                System.out.println("Underflow");
            }
            else{
                top = top-1;
                System.out.println("item Deleted");
            }
        }
        void display()
        {
            System.out.print("Items are:");
            for(int j=top; j>=0;j--){
                System.out.println(a[j]);
            }
        }
    }
public class StackUsingArray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        stack st = new stack();   // moved outside loop
        int l;
        do{
        int d;
        System.out.println("Press 1 to push");
        System.out.println("Press 2 to pop");
        System.out.println("Press 3 to display");
        d=sc.nextInt();
        switch(d)
        {
            case 1:
                {
                    st.push();
                    break;
                }
            
            case 2:
                {
                    st.pop();
                    break;
                }

            case 3:
                {
                    st.display();
                    break;
                }
                
        }
         System.out.println("Enter 0 to go back to the main menu");
         System.out.println("ENter any key to exit");
         l=sc.nextInt();
    }while(l==0);
    System.out.print("EXIT SUCESSFULLY");
    }
}
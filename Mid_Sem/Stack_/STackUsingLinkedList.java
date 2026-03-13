package Mid_Sem.Stack_;
import java.util.Scanner;

class stack
{
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
        Node top=null;
    }

    void push(Scanner sc){
        System.out.println("Enter data");
        int data = sc.nextInt();
        Node new_node=new Node(data);
        if(top==null){
            top=new_node;
        }
        else{
            new_node.next=top;
            top=new_node;
        }
    }
}
public class STackUsingLinkedList {
    public static void main(String[] args) {
        int d ,l;
        Scanner sc = new Scanner(System.in);
        stack s = new stack();
        do{
            System.out.print("Pree 1 to push");
            System.out.print("Press 2 to pop");
            System.out.print("Press 3 to Display");

            d=sc.nextInt();
            switch(d)
            {
                case 1:
                    {
                    s.push(sc);
                    break;
                    }
                case 2:
                    {
                    s.pop();
                    break;
                    }
                case 3:
                    {
                        s.display();
                        break;
                    }

            }
            System.out.println("Enter 0 to go back to the main menu");
         System.out.println("ENter any key to exit");
         l=sc.nextInt();

        }while(l==0);
        System.out.print("Exit Sucssefuly");
    }
}

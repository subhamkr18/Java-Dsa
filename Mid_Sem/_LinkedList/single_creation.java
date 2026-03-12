package Mid_Sem._LinkedList;
import java.util.Scanner;
public class single_creation {
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    Node head =null;
    public void creation(){
        int data , n;
        Scanner sc =new Scanner(System.in);
        do{
        System.out.print("Enetr data: ");
        data = sc.nextInt();
        Node new_node = new Node(data);
        if(head==null){
            head=new_node;
        }
        else
        {
            new_node.next=head;
            head=new_node;
        }
        System.out.print("Do you want to add more data. if yes press : 1");
        n=sc.nextInt();
        }
        while(n==1);
        
    }
    public void traverse(){
        Node temp=head;
        if(head==null)
        {
            System.out.println("LinkedList does'nt exsits");
        }
        else
        {
            while(temp !=null)
            {
                System.out.println(temp.data);
                temp=temp.next;
            }
        }
    }

    public static void main(String[] args) {
        single_creation st=new single_creation();
        st.creation();
        st.traverse();
    }
}

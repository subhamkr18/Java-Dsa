package Mid_Sem._LinkedList;
import java.util.Scanner;

public class DeletioninLinkedList {

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
            System.out.print("Enter data: ");
            data = sc.nextInt();

            Node new_node = new Node(data);

            if(head==null){
                head=new_node;
            }
            else{
                new_node.next=head;
                head=new_node;
            }

            System.out.print("Do you want to add more data. if yes press : 1 ");
            n=sc.nextInt();

        } while(n==1);
    }

    public void traverse(){
        Node temp=head;

        if(head==null){
            System.out.println("LinkedList doesn't exist");
        }
        else{
            while(temp !=null){
                System.out.println(temp.data);
                temp=temp.next;
            }
        }
    }

    public void delete(){
        int m,n = 0,p;
        Scanner sc= new Scanner(System.in);

        do{
            if(head == null){
                System.out.println("LL is Empty");
            }
            else{
                System.out.println("Enter 1 to delete from beginning, 2 from end, 3 from specific position");
                m=sc.nextInt();

                switch(m){

                    case 1:
                        Node temp =head;
                        temp=temp.next;
                        head=temp;
                        break;

                    case 2:
                        Node temp1 = head;
                        Node ptr = temp1.next;

                        while(ptr.next !=null){
                            temp1 =ptr;
                            ptr = ptr.next;
                        }
                        temp1.next=null;
                        break;

                    case 3:
                        System.out.print("Enter the position of the node to be deleted: ");
                        p=sc.nextInt();

                        Node temp2=head;
                        Node ptr1=temp2.next;

                        for(int i=0;i<p-2;i++){
                            temp2 =ptr1;
                            ptr1 =ptr1.next;
                        }

                        temp2.next=ptr1.next;
                        break;
                }

                System.out.print("Delete more nodes? Press 1: ");
                n=sc.nextInt();
            }

        } while(n==1);
    }

    public static void main(String[] args) {

        DeletioninLinkedList obj = new DeletioninLinkedList();

        obj.creation();
        obj.traverse();
        obj.delete();
        obj.traverse();
    }
}
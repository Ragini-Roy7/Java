package Linked_List;

public class Linked_List {
    public static class Node{
        int data;
        Node next;
        public Node(int data) {
            this.data=data;
            this.next=null;
            //currently linked list is empty
        }
    }
    public Node head;
    public Node tail;
    //head and node of linked_list created
    public void addFirstElement(int data) {
        Node newNode= new Node(data);
        //creating new node
        if(head==null){
            head=tail=newNode;
            return;
        }
        //adding new node at start of linked_list
        newNode.next= head;
        //updating head
        head= newNode;
    }
    public void addLastElement(int data) {
        Node newNode= new Node(data);
        if(head==null) {
            head=tail=newNode;
            return;
        }
        //tail ka next node is new_node
        tail.next=newNode;
        tail=newNode;
    }
    public void printElement() {
        if(head==null){
            System.out.println("Linked List is Empty");
            return;
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data + "->");
            temp=temp.next;
            //moving temp forward for complete traversal
        }
        System.out.println("null");
    }
    public void add_at_mid(int data) {
        Node newNode= new Node(data);
        if(head==null || head.next==null){
            addFirstElement(data);
            return;
        }
        //find mid of linked_list
        Node temp=head;
        int size=0;
        while(temp!=null){
            size++;
            temp=temp.next;
        }
        int mid= size/2;
        temp=head;
        for(int i=0;i<mid-1;i++){
            temp=temp.next;
        }
        newNode.next=temp.next;
        temp.next=newNode;
    }
    public void add_at_given_index(int index,int data) {
        Node newNode= new Node(data);
        Node temp=head;
        int i=0;
        if(index==0) {
            newNode.next=head;
            head=newNode;
            return;
        }
        //moving reference till index-1
        while(temp!=null && i<index-1){
            temp=temp.next;
            i++;
        }
        if(temp==null) {
            //temp reference var when reaches null (end of linked_list)
            //means not to be inserted
            //index reaches its length
            System.out.println("Index out of bounds");
            return;
        }
        //connecting new node
        newNode.next= temp.next;
        temp.next=newNode;
        //updating tail if insertion at the end of linked_list
        if(newNode.next==null){
            tail=newNode;
        }
    }
    public static void main(String[] args) {
        //creating objects
        Linked_List ll= new Linked_List();
        ll.addFirstElement(67);
        ll.printElement();

        ll.addLastElement(68);
        ll.printElement();
        ll.printElement();

        ll.add_at_mid(56);
        ll.printElement();

        ll.add_at_mid(34);
        ll.printElement();

        ll.printElement();
    }
}

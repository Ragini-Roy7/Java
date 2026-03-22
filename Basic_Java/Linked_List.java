public class Linked_List {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
            //linked_list is empty currently
        }
    }
        //linked_list properties
        public Node head;
        public Node tail;

        public void addFirstElement(int data) {
            Node newNode = new Node(data);
            //creating new_node object using the node class
            if(head==null){
                head=tail=newNode;
                return;
            }
            //adding new node at start of linked_list
            newNode.next=head;
            //updating head to new_node
            head= newNode;
        }
        public void addLastElement(int data) {
            //add to tail
            Node newNode = new Node(data);
            if(head==null) {
                head=tail=newNode;
                return;
            }
            //tail next is new_node
            //linkage b/w tail and new_node (to add)
            tail.next= newNode;
            tail= newNode;

        }

        public void printElement(){
            if(head==null){
                System.out.println("Linked list is empty");
                return;
            }
            Node temp=head;
            while(temp!= null){
                System.out.print(temp.data + "->");
                temp=temp.next;
                //updating temp next node
            }
            System.out.println("null");
        }
    public void deleteLastElement(int data) {
        Node newNode= new Node(data);
//            Node prevNode= new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
//            data.prevNode= tail;
//            tail=prevNode;
        Node temp=head;
        //traversing to second last node
        while(temp.next !=tail){
            temp=temp.next;
            //moving temp reference ptr next
            //traversing the linked_list
        }

        temp.next=null;
        tail=temp;

    }
    public void add_at_middle(int data) {
            Node newNode= new Node(data);
            Node prevNode= new Node(data);
            Node nextNode = new Node(data);
            //taking prev_node to connect linkage b/w prev_node and new_node
        //break linkage b/w node and node.next
        //middle insertion possible only if more than head and tail nodes exist
        if(head==null ){
            head=tail=newNode;
            return;
        }
        Node temp=head;
//        if(temp.next!=tail) {
//            //only then insertion at mid is possible
//            prevNode.next= newNode;
//            newNode.next= nextNode;
        //newNode doesn`t exist in the list
       //find mid
        int size=0;
        while(temp!=null) {
            size++;
            temp= temp.next;
            //traversing temp to whole linked list
            int mid=size/2;
            temp=head;
            //one index back mid-1
            for(int i=0;i<mid-1;i++) {
                temp=temp.next;
            }
            //insertion
            newNode.next= temp.next;
            //new node linkage b/w next node
            temp.next= newNode;
        }
//        }

    }
        public static void main(String[] args) {
            Linked_List ll= new Linked_List();
            //creating objects
            ll.addFirstElement(54);
            ll.printElement();

            ll.addFirstElement(89);
            ll.printElement();

            ll.addLastElement(67);
            ll.printElement();

            ll.addLastElement(74);
            ll.printElement();

            //printing linked_list
            ll.printElement();

            ll.deleteLastElement(74);
            ll.printElement();

            ll.add_at_middle(67);
            ll.printElement();
        }
    }


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
            }
            System.out.println("null");
        }
        public static void main(String[] args) {
            Linked_List ll= new Linked_List();
            //creating objects
            ll.addFirstElement(54);
            ll.addFirstElement(89);
            ll.addLastElement(67);
            ll.addLastElement(74);

            //printing linked_list
            ll.printElement();
        }
    }


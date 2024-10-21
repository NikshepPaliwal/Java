class linkedList{
    Node head;
    class Node{
        String data;
        Node next;


        Node(String data){
            this.data = data;
            this.next = null;
        }

    }


    public static void main(String[] args) {
        
        linkedList ll = new linkedList();
        ll.addFirst("a");
        ll.addFirst("b");
        ll.printList();
        ll.addLast("Niks");
        ll.addLast("Akshi");
        ll.printList();
        ll.deleteFirst();
        ll.printList();
        ll.deleteLast();
        ll.printList();
    
        

    }


    public void addFirst(String data){
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    public void addLast(String data){
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        
        Node currNode = head;
        while (currNode.next!=null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;

        
    }

    public void printList(){
        if(head.equals(null)){
            System.out.println("List is empty");
            return;
        }
        Node currNode = head;
        while (currNode!=null) {
            System.out.print  (currNode.data + "->");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }

    public void deleteFirst(){
        if(head == null){
            System.out.println("List is Empty");
            return;
        }
        head = head.next;
    }

    public void deleteLast(){
        if(head == null){
            System.out.println("List is Empty");
            return;
        }

        if(head.next == null){
            head = null;
            return;
        }

        Node secondLastNode = head;
        Node lastNode = head.next;
        while (lastNode.next == null){
            lastNode = lastNode.next;
            secondLastNode = secondLastNode.next;  
        }

        secondLastNode.next = null;
    }
}
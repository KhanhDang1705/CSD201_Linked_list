package singlylinkedlist;

public class SingLyLinkedList {
    private Node head;

    public SingLyLinkedList() {
        addFirst(0);
        addFirst(-10);
        addFirst(-20);
        printListNode();
        addLast(10);
        addLast(20);
        printListNode();
        getNodeByPosition(3, 8);
        printListNode();
    }

    public void addFirst(int data){
        Node newNode = new Node(data);
        newNode.setNext(head);
        head = newNode;
    }

    public void addLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.getNext() != null){
            temp = temp.getNext();
        }
        temp.setNext(newNode);
    }

    public void getNodeByPosition(int index, int data){
        Node newNode = new Node(data);
        if (index == 0){
            addFirst(data);
            return;
        }
        Node temp = head;
        int viTri = 0;
        while (viTri < index - 1){
            temp = temp.getNext();
            viTri++;
        }
        Node nextNode = temp.getNext();
        temp.setNext(newNode);
        newNode.setNext(nextNode);
    }

    public void printListNode(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.getData());
            if (temp.getNext() != null){
                System.out.print(" --> ");
            }
            temp = temp.getNext();
        }
        System.out.println();
    }
}

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
        System.out.println(removeFirst().getData());
        printListNode();
        System.out.println(removeLast().getData());
        printListNode();
        System.out.println(remove(0).getData());
        printListNode();
        System.out.println(remove(1).getData());
        printListNode();
    }

    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
        } else{
            newNode.setNext(head);
            head = newNode;
        }
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

    public void addLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
        } else {
            Node temp = head;
            while(temp.getNext() != null){
                temp = temp.getNext();
            }
            temp.setNext(newNode);
        }
    }

    public void getNodeByPosition(int index, int data){
        Node newNode = new Node(data);
        if(index == 0){
            addFirst(data);
        } else {
            Node temp = head;
            int count = 0;
            while (count < index - 1) {
                count++;
                temp = temp.getNext();
            }
            Node nextNode = temp.getNext();
            temp.setNext(newNode);
            newNode.setNext(nextNode);
        }
    }

    public Node removeFirst(){
        if(head == null){
            return null;
        } 
        Node delete = head;
        head = head.getNext();
        return delete;
    }

    public Node removeLast(){
        if(head == null){
            return null;
        }
        Node temp = head;
        Node pre = null;
        while (temp.getNext() != null){
            pre = temp;
            temp = temp.getNext();
        }
        pre.setNext(null);
        return temp;
    }

    public Node remove(int index){
        if(head == null){
            return null;
        } else if(index == 0){
            return removeFirst();
        }
        int count = 0;
        Node temp = head;
        Node pre = null;
        while (count < index) { 
            pre = temp;
            temp = temp.getNext();
            count++;
        }
        pre.setNext(temp.getNext());
        return temp;
    }
}

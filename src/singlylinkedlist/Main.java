package singlylinkedlist;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SingLyLinkedList list = new SingLyLinkedList();
        Scanner sc = new Scanner(System.in);
        int choice;

        while (true){
            System.out.println("1. AddFirst");
            System.out.println("2. AddLast");
            System.out.println("3. AddByPosition");
            System.out.println("4. ShowListNode");
            System.out.println("5. RemoveFirst");
            System.out.println("6. RemoveLast");
            System.out.println("7. RemoveIndex");
            System.out.println("0. Exit");
            System.out.print("Choice: ");
            choice = Integer.parseInt(sc.nextLine());

            switch (choice){
                case 1:
                    int data1 = Integer.parseInt(sc.nextLine());
                    list.addFirst(data1);
                    break;
                case 2:
                    int data2 = Integer.parseInt(sc.nextLine());
                    list.addLast(data2);
                    break;
                case 3:
                    String[] input = sc.nextLine().split(" "); 
                    int index = Integer.parseInt(input[0]);
                    int data3 = Integer.parseInt(input[1]);
                    list.getNodeByPosition(index, data3);
                    break;
                case 4:
                    list.printListNode();
                    break;
                case 5:
                    list.removeFirst();
                    break;
                case 6:
                    list.removeLast();
                    break;
                case 7:
                    int indexRemove = Integer.parseInt(sc.nextLine());
                    list.remove(indexRemove);
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Please choice again!");
                    break;
            }
        }
    }
}

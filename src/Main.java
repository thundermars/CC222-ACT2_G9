import java.util.Scanner;
class Node{
    int data;
    Node next;

public Node(int d){
    data = d;
    next = null;
}
}
class SingleLinkedList{
    Node head;

    public void insAtBeginning(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void insAtEnd(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        if(head == null){
            head = newNode;
        }else{
            Node last = head;
            while(last.next != null){
                last = last.next;
            }
            last.next = newNode;
        }
    }
public void display(){
    Node x = head;
    while(x != null){
        System.out.println("["+x.data+ "]");
        x = x.next;
    }
    System.out.println("null");
}
}
public class Main {
    public static void main(String[] args){
       Scanner scanner = new Scanner(System.in);
       SingleLinkedList list = new SingleLinkedList();
       
       while(true){
        System.out.println("Enter a value:");
        int value = scanner.nextInt();

        System.out.println("\nOperations:");
        System.out.println("[1]Insert" + value + "to the array");
        System.out.println("[2]Insert" + value + "to the linked list");

        System.out.println("Choice:");
        int choice = scanner.nextInt();

        if(choice == 1){
            list.insAtBeginning(value);
        }else if(choice ==2){
            list.insAtEnd(value);
            System.out.println("Insert 1 at: ");
            System.out.println("[1] Beginning");
            System.out.println("[2] End");
            System.out.println("Choice:");
            int choice1 = scanner.nextInt();
            System.out.println("Linked list after insertion: ");


        }else{
            System.out.println("Invalid choice. Try again.");
            continue;
        }
        System.out.println("Array after insertion:");
        list.display();

        System.out.println("\nOptions:");
        System.out.println("[1]Enter a new value");
        System.out.println("[2]End");
        System.out.println("choice:");
        int nextChoice = scanner.nextInt();

        if(nextChoice == 2){
            System.out.println("Program ended.");
            break;
        }
        }
       scanner.close();
    }
}

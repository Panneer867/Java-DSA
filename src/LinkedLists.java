//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class LinkedLists {

    Node head;
    Node tail;
    int size;

    LinkedLists(int value) {
        Node node = new Node(value);
        this.head = node;
        this.tail = node;
        this.size = 1;
    }

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    private void getSize() {
        System.out.println("Size of the list is: " + size);
    }

    private void getHead() {
        System.out.println("Head : " + head.data);
    }

    private void getTail() {
        System.out.println("Tail : " + tail.data);
    }

    private void append(int value) {
        Node node = new Node(value);
        if (size == 0) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
        size++;

    }

    public static void main(String[] args) {

        LinkedLists list = new LinkedLists(5);

        list.getHead();
        list.getTail();
        list.append(3);
        list.append(4);
        list.printList();
        list.getSize();
    }
}
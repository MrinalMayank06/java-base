class Node1 {
    int data;
    Node1 next;

    Node1(int data){
        this.data =data;
        this.next =null;
    }
}
class CustomLL {
    Node1 head;

    public void add(int data) {
        Node1 newNode = new Node1(data);
        if (head == null) {
            head = newNode;
        } else {
            Node1 current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void printReverse(Node1 node) {
        if (node == null) {
            return;
        }
        printReverse(node.next);
        System.out.println(node.data + " ");
    }

    public void printReverse() {
        printReverse(head);
    }

    public void printlist() {
        Node1 current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.print("null");
    }
}
public class km_reverse_order_linkedList {
    public static void main(String[] args) {
        System.out.println("Reverse order Linked list");
CustomLL list = new CustomLL();
for (int i = 1; i<=10 ;i++){
    list.add(i);

    System.out.println("Original Linked List: ");
    list.printlist();

    System.out.println("Reverse LinkedList: ");
    list.printReverse();

}

    }
}






















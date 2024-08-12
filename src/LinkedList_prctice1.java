//implement the node class firstly
class  Node {
    int data;
    Node1 next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node1 head;

    // method for inserting the new node
    public void insert(int data){
        Node1 newnode = new Node1(data);
        if (head == null){
            head =newnode;
        }
        else {
            Node1 temp = head;
            while (temp.next !=null){
                temp =temp.next;
            }
            temp.next =newnode;
        }
    }



}




public class LinkedList_prctice1 {
    public static void main(String[] args) {


    }
}

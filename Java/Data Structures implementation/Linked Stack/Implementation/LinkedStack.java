
public class LinkedStack {
    private Node node;
    private Node top;
    LinkedStack(){

    }
    void push (int input){
        this.node = new Node(input);
        this.node.setNext(top);
        this.top = this.node;
    }
    int pop(){
        if (this.isEmpty() == false) {
            Node temp = this.node;
            this.top = this.node.getNext();
            this.node = top;
            return temp.getValue();
        } else {System.out.println("the array is empty");return 0;}
    }
    boolean isEmpty(){
        if (this.top == null) return true;
        else return false;
    }
    void print(){
        Node temp = this.top;
        while(temp != null){
            System.out.print(temp.getValue() + " ");
            temp = temp.getNext();
        }
        System.out.println("");
    }
}
class Node{
    private int value;
    private Node next;

    Node(int value){
        this.value = value;

    }
    Node(int value,Node next){
        this.value = value;
        this.next = next;

    }

    public void setNext(Node next) {
        this.next = next;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Node getNext() {
        return next;
    }

    public int getValue() {
        return value;
    }
}

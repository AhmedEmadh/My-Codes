public class Main {
    public static void main(String[] args) throws Exception {
        int counter = 100;
        LinkedStack linkedStack = new LinkedStack();
        for(int i=1;i<=counter;i++)
        linkedStack.push(i);
        linkedStack.print();
        for(int i=1;i<=counter;i++)
        System.out.println(linkedStack.pop());





    }
}
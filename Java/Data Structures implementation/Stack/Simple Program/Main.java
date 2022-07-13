public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello world!");
        Stack stack = new Stack();
        System.out.println("is empty");
        System.out.println(stack.isEmpty());
        System.out.println("initializing");
        System.out.println("");
        stack.print();
        for(int i=0;i<=20;i++){stack.push(i);stack.print();} //initializing stack with numbers from 0 to 19

        System.out.println("");
        System.out.println("emptying");
        System.out.println("");

        stack.print();
        for(int i=19;i>=0;i--){ //emptying the stack
            stack.pop();
            stack.print();

        }

        System.out.println("");
        System.out.println("fulling");
        System.out.println("");

        for(int i=0;i<=14;i++){//full the stack again
            stack.push(i);
            stack.print();

        }
        System.out.println("size is: "+stack.getSize());

    }
}
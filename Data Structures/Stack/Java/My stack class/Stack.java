public class Stack {
    private int size=10;
    private int[] data;
    private int top;
    Stack(){
        this.top = -1;
        this.size = 10;
         data=new int[size];
    }
    Stack(int s){
        this.size = s;this.top=-1;
        data = new int[size];
    }



    void push(int input) {

        if(top < size-1){
        top++;
        data[this.top] = input;}else{System.out.println("Stack is full");}

    }
    int pop(){
        if(top >= 0){ top--;
            return data[this.top + 1];
        }else{ System.out.println("Stack is empty");return 0;}
    }
    int getTop(){
            return data[this.top];
        }
        boolean isEmpty(){
            if(top<-1){
               return true;
            } else return false;
        }
        void print(){
                if(top != -1) {
                    for (int i = top; i >= 0; i--) {
                        System.out.print(data[i]);
                        System.out.print(" ");
                    }
                    System.out.println();
                } else if (top == -1) {
                    System.out.println("stack is empty");
                }
        }

    public int getSize() {
        return size;
    }
}

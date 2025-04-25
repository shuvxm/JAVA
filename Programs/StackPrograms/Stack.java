package StackPrograms;

public class Stack {

    private int[] arr = new int[3];
    // int top = -1; // bcz we dont hv value rn so stack is empty
    int top;
    int size;

    public Stack(){
        size = arr.length;
        top = -1;
    }

    public void push(int data){
        if (top >= size-1) {
            // System.out.println("Stack overflow");
            // return;
            throw new StackOverflowException("Stack overflow: cannot push " + data);
        }
        top++;
        arr[top]= data;
    }

    public int pop(){
        if (top == -1) {
            throw new StackUnderflowException("Stack underflow: cannot pop, stack is empty ");
        }
        // top = top-1;
        return arr[top--];
    }

    public int peek(){
        if (top < 0) {
            throw new StackUnderflowException("Stack is empty: cannot peak");
        }
        return arr[top];
    }


    public void printStack(){
        for (int n : arr) {
            System.out.print(n+" ");
        }
        System.out.println();
    }

    // isFull method create
    public boolean isFull(){

        if (top >= size) {
            return true;
        }
        return false;
    }
    // isEmpty method create
    public boolean isEmpty(){

        if ( top == -1) {
            return true;
        }
        return false;
    }
}

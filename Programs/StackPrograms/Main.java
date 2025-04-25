package StackPrograms;

public class Main {
    public static void main(String[] args) {
        
        Stack nums = new Stack();

        System.out.println(nums.isEmpty());
        // nums.pop();

        // nums.push(10);
        // nums.push(30);
        // System.out.println(nums.pop());
        // nums.push(40);
        // nums.push(20);
        // System.out.println(nums.peek());
        // nums.push(20);
        // nums.push(90);
        // System.out.println(nums.peek());
        
        // nums.push(10);
        // System.out.println(nums.isEmpty());
        // nums.push(30);        
        // nums.push(30);
        // System.out.println(nums.isFull());        
        // nums.push(30);
        // nums.push(30);
        // System.out.println(nums.isFull());        

        try{
            nums.push(100);
            nums.push(200);
            nums.push(300);
            nums.push(300);
        } catch(StackOverflowException e){
            System.out.println(e.getMessage());
        }

        try {
            System.out.println(nums.pop()); // 300
            System.out.println(nums.pop()); // 200
            System.out.println(nums.pop()); // 100
            System.out.println(nums.pop()); // will throw exception
        } catch (StackUnderflowException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(nums.peek());
           
       

        nums.printStack();

        
    }
}

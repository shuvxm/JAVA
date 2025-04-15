public class Recursion_fact {
    public static void main(String[] args) {
        int result = factorial(5);
        System.out.println(result);
        // System.out.println(convertNegativeToPositive(-51));
    }
    private static int factorial(int n){
        if( n < 0){
            throw new IllegalArgumentException("factorial is not defined for negative numbers");
        }
        if(n==0)
            return 1;
        else
            return n * factorial(n-1);
    }
    private static int convertNegativeToPositive(int x){
        x = Math.abs(x);
        return x;
    }
}

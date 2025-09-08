package Basic;

public class SumofDig{
    public static void main(String[] args) {
        int n = 687;
        System.out.println(getSum(n));
    }
    static int getSum(int n){
        int sum = 0;
        while(n>0){
            sum = sum + n%10; // take out last digit to add
            n/=10; // take quotient (eliminate last digit)
        }
        return sum;
    }
}


public class _5Prime {
    public static void main(String[] args) {
        int n = 2333;
        prime3(n);
        
    }
    // time complexity would be O(n)
    static void prime1(int n){
        int flag = 0;
        int count = 0;

        if (n < 2) {
            System.out.println(n + " is not prime");
        } else {
            for (int i = 2; i < n; i++) {
                count++;
                if (n % i == 0) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 1)
                System.out.println(n + " is not prime");
            else
                System.out.println(n + " is prime");
            System.out.println(count);
        }
    }

    // check till n/2 cos last divisible factors for any number except that number itself is N/2 them just hv to check till N/2
    // time complexity would be O(n/2)
    static void prime2(int n){
        int flag = 0;

        if( n < 2)
            System.out.println(n+" is not prime");
        else{
            for(int i=2; i <= n/2; i++){
                if(n % i == 0){
                    flag = 1;
                    break;
                }
            }
            if(flag == 1)
                System.out.println(n+" is not prime");
            else
                System.out.println(n+" is prime");
        }
    }

    // A much better approach: reduce the TC: O(sqrt(n))
    static void prime3(int n){
        int flag = 0;
        int count = 0;
        if(n<2)
            System.out.println(n+" is not prime");
        else {
            for(int i = 2; i<= Math.sqrt(n); i++){
                count++;
                if(n % i == 0){
                    flag = 1;
                    break;
                }
            }
            if(flag == 1)
                System.out.println(n+" is not prime");
            else
                System.out.println(n+" is prime");
            System.out.println("no of iterations: "+count);
        }
    }
}

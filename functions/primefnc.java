// Check whether number is prime or not using a function.


public class primefnc {

    // only for n>=2 
    public static boolean isPrime(int n){
        // corner cases 
        // 2
        if(n == 2){
            return true;
        }
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(isPrime(2)); //Output: true
        System.out.println(isPrime(12)); //Output: false
        System.out.println(isPrime(7)); //Output: true
    }
}

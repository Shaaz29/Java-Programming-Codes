// Question : Print all Prime Number in a Range



public class primeinrange {
        // only for n>=2 
     public static boolean isPrime(int m){
        // corner cases 
        // 2
        if(m == 2){
            return true;
        }
        for(int i = 2; i <= Math.sqrt(m); i++){
            if(m%i == 0){
                return false;
            }
        }
        return true;
}

    public static void primeRange(int n){
        for(int i = 2; i <=n; i++){
            if(isPrime(i)){
            System.out.println(i+" ");
            }
        }
    System.out.println();
    }


    public static void main(String[] args) {
        primeRange(16); // Prime Numbers from 2 to 16
}
}

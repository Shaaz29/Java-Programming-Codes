// Calculate nCr (Binomial Coefficient) using function: 
// Formula: nCr = n!/(n-r)! * r!


import java.util.*;
public class binomialcoeff {
    public static int factorial(int num){
        int f = 1;
        for(int i = 1;i<=num;i++){
            f = f*i;
        }
        return f;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n :");
        int n = sc.nextInt();
        System.out.println("Enter r :");
        int r = sc.nextInt();
        float binomialCoef = factorial(n)/(factorial(n-r)*factorial(r));
        System.out.println("Binomial Coefficient of :" + n+" C "+ r+ " is: "+binomialCoef);
    }
}
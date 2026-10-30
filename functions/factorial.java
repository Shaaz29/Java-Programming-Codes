//Program to print factorial of a number using function

import java.util.*;

public class factorial {

    public static int fact(int num){
        int mul = 1;
        for(int i = 1;i<=num;i++){
            mul = mul*i;
        }
        return mul;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int factor = fact(n);
        System.out.println("Factorial of a number is :" + factor);
    }
}

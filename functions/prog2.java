// Sum of two numbers using function:

import java.util.*;

public class prog2 {
    
    public static int calculateSum(int num1,int num2){   //Formal Parameters or Parameters
        int sum = num1 + num2;
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int add = calculateSum(a, b);   // Arguments or Actual Parameters
        System.out.println("Sum is :" +add);
    }
}

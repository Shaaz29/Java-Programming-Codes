// Sum of n numbers using while loop

import java.util.*;

public class sumofn {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number till you want sum from 0 : ");
    int n = sc.nextInt();
    int sum = 0;
    int count = 1;
    while(count<=n){
        sum=sum+count;
        count++;
    }
    System.out.println("Sum of numbers are :" +sum);
   } 
}

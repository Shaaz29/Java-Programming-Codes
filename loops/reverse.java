// Program to Print Reverse of a number by user input

import java.util.*;
public class reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        while(n>0){
            int rem = n%10;
            System.out.print(rem);
            n=n/10;
        }
        System.out.println();
        }
}

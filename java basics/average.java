//Average of 3 numbers from user input

import java.util.*;
public class average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a : ");
        int a = sc.nextInt();
        System.out.println("Enter b : ");
        int b = sc.nextInt();
        System.out.println("Enter c : ");
        int c = sc.nextInt();
        int average = (a+b+c)/3;
        System.out.println("Average of three numbers is : " + average);
        }
}

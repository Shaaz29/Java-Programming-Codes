import java.util.*;

public class largest3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        int a = sc.nextInt();
        System.out.println("Enter second number:");
        int b = sc.nextInt();
        System.out.println("Enter third number:");
        int c = sc.nextInt();
        if(a>=b && a>=c){
            System.out.println("largest number is a:"+a);
        }
        else if(b>=c){
            System.out.println("largest number is b :"+b);
        }
        else{
            System.out.println("largest number is c :"+c);
        }
    }
}

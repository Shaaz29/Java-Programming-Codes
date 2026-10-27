import java.util.*;

public class calculatorswitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a = sc.nextInt();
        System.out.println("Enter second number: ");
        int b = sc.nextInt();
        System.out.println("Enter Operator");
        char ch = sc.next().charAt(0);
        switch(ch){
            case '+' : System.out.println("Sum of two numbers is :" + (a+b));
            break;
            case '-' : System.out.println("Difference of two numbers is :" + (a-b));
            break;
            case '*' : System.out.println("Multiplication of two numbers is :" + (a*b));
            break;
            case '/' : System.out.println("Division of two numbers is :" + (a/b));
            break;
            case '%' : System.out.println("Modulo of two numbers is :" + (a%b));
            break;
            default : System.out.println("Enter a valid operator");
        }
    }
}

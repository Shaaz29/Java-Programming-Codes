// Assignment 2 : Write a method named isEven that accepts an int argument.
// The method should return true if the argument is even, 
// or false otherwise. Also write a program to test your method.


public class assignm2 {

    public static boolean isEven(int n){
        if(n%2 == 0){
             return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        System.out.println(isEven(35));
    }
}

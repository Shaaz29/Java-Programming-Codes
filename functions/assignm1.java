//Assignment 1 : Write a Java method to compute the average of three numbers.


public class assignm1 {
    
    public static int average(int a, int b, int c){
        int sum = a+b+c;
        int avg = sum/3;
        return avg;
    }
    public static void main(String[] args) {
        System.out.println("Average of three number is : "+ average(7,13,10));
    }
}

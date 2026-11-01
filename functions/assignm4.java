// Write a Java method to compute the sum of the digits in an integer.
// (Hint : Approach this question in the following way :
// a. Take a variable sum = 0
// b. Find the last digit of the number
// c. Add it to the sum
// d. Repeat a & b until the number becomes 0 )



public class assignm4 {
    
    public static int sumOfDigit(int num){
        int sum = 0;
        while(num>0){
            int dig = num%10;
            sum = sum + dig;
            num  = num/10;
        }
        return sum;
    }


    public static void main(String[] args){
        System.out.println("Sum of digits in 1234 is : " + sumOfDigit(1234));
    }
}

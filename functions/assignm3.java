// Write a Java program to check if a number is a palindrome in Java? ( 121 is a
// palindrome, 321 is not)
// A number is called a palindrome if the number is equal to the reverse of a number 
// e.g., 121 is a palindrome because the reverse of 121 is 121 itself. On the other hand,
// 321 is not a palindrome because the reverse of 321 is 123, which is not equal to 321



public class assignm3 {

    //Function to find reverse of a number..

    public static int checkRev(int n){
        int m = n;
        int rev = 0;
        while(n>0){
            int rem = n%10;
            rev = rev*10 +rem;
            n = n/10;
        }
        return rev;
    }

    public static void checkPalin(int num){
        if(num == checkRev(num)){
            System.out.println("Number is Palindrome");
        }else{
            System.out.println("Number is not Palindrome");
        }
    }
    public static void main(String[] args) {
        checkPalin(121);
        checkPalin(567);
    }
}

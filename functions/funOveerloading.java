// Function Overloading depends on parameters passed , it is independent on return type of function 
// Example of Function Overloading: 


public class funOveerloading {
    //function to calculate sum of two numbers:
    public static int sum(int a,int b){
        return a+b;
    }

    //function to calculate sum of three numbers:
    public static int sum(int a,int b, int c){
        return a+b+c;
    }
    
    public static void main(String[] args) {
        System.out.println(sum(3,5));
        System.out.println(sum(7,9,10));
    }
}

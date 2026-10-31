// Function Overloading depends on parameters passed ,
//  it is independent on return type of function 
// Example of Function Overloading by changing the data types 

public class funOverloading2 {
    // function to calculate sum of two numbers:
    public static int sum(int a, int b) {
        return a + b;
    }

    // function to calculate sum of two numbers of float type :
    public static float sum(float a, float b) {
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println(sum(3, 5));
        System.out.println(sum(3.8f, 4.9f));
    }
}

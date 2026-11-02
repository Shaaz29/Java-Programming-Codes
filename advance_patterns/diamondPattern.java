// Question: Print Diamond Pattern: 

//     *
//    ***
//   *****
//  *******
//  *******
//   *****
//    ***
//     *


public class diamondPattern {

    public static void diamond(int n){
        //outer loop
        for (int i= 1; i<=n; i++){
            // printing spaces first : 
            // inner loop:
            for(int space=1;space<=n-i;space++){
                System.out.print(" ");
            }
            // printing stars now:
            for(int star=1; star<=2*i-1; star++){
                System.out.print("*");
            }
            // next line
            System.out.println();
        }
        // outer loop for opposite or
        // mirror image of above pattern:
        for(int j = n; j>=1; j--){
            //same code for printing stars and spaces 
            // printing spaces first : 
            // inner loop:
            for(int space=1;space<=n-j;space++){
                System.out.print(" ");
            }
            // printing stars now:
            for(int star=1; star<=2*j-1; star++){
                System.out.print("*");
            }
            // next line
            System.out.println();
        }
    }
    public static void main(String[] args) {
        diamond(7);
    }
}

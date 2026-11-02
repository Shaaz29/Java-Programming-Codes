// Question: Print this Butterfly Pattern:

//      *       *
//      **     **
//      ***   ***
//      **** ****
//      **** ****
//      ***   ***
//      **     **
//      *       *

public class butterfly_pattern {

    public static void butterf_Pattern(int n){
        // First Half Pattern
        // outer loop
        for(int i = 1; i<=n; i++){

            //inner loop
            //printing some stars :
            for(int star = 1; star <= i; star++){
                System.out.print("*");
            }

            // printing some spaces :
            for(int space = 1; space <= (n-i)*2; space++){
                System.out.print(" ");
            }

            // printing some stars at last :
            for(int star = 1; star <= i; star++){
                System.out.print("*");
            }

            //next line
            System.out.println();
        }

            // For mirror image of above pattern : 
            // logic will be that run your outer loop 
            // from n to 1 and keep the inner loop logic same . 


            // Second Half
            //outer loop
            for(int k = n; k>=1; k--){

            //inner loop
            //printing some stars :
            for(int star = 1; star <= k; star++){
                System.out.print("*");
            }

            // printing some spaces :
            for(int space = 1; space <= (n-k)*2; space++){
                System.out.print(" ");
            }

            // printing some stars at last :
            for(int star = 1; star <= k; star++){
                System.out.print("*");
            }

            //next line
            System.out.println();
        }
}
    public static void main(String[] args) {
        butterf_Pattern(4);
    }
}
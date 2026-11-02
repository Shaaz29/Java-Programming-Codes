// Question: Print Hollow Rhombus Pattern: 

//      *****
//     *   *
//    *   *
//   *   *
//  *****
public class hollow_Rhombus {

    public static void hollowRhomb(int n){
        
        //outer loop:
        for(int i = 1; i<=n; i++){
            // condition to check boundary row number: 
            if(i==1 || i==n){

                //inner loop:
                // printing space for first row:
                for(int space=1;space<=n-i; space++){
                    System.out.print(" ");
                }

                // printing star for last row:
                for(int star =1 ; star<=n; star++){
                    System.out.print("*");
                }

                //next line: 
                System.out.println();
            }else{
                // inner loop
                // printing some spaces 
                for(int space=1; space<=n-i;space++){
                    System.out.print(" ");
                }

                // printing one star in middle
                System.out.print("*");

                //again printing some spaces 
                for(int space=1; space<=n-2;space++){
                    System.out.print(" ");
                }

                // printing one star at end
                System.out.print("*");

                //next line
                System.out.println();
                }
            }
        }

    public static void main(String[] args) {
        hollowRhomb(4);
    }
}

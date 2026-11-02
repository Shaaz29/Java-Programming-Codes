// Question: Printing Solid Rhombus Pattern :

    //      *****
    //     *****
    //    *****
    //   *****
    //  *****

public class solid_rhombusPatt {

    public static void solid_Rhombus(int n){
        // outer loop
        for(int i = 1; i<=n; i++){
            // inner loop 
            // printing spaces :
            for(int space =1; space<=(n-i);space++){
                System.out.print(" ");
            }
            // printing stars 
            for (int star = 1; star<= n; star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        solid_Rhombus(5);
    }
}

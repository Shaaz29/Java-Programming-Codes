//Print this pattern of stars: 
/*

      *
     **
    ***
   ****
*/



import java.util.*;

public class ques5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row number till you want to print inverted star pattern:");
        int n = sc.nextInt();
        for(int row =1; row<=n;row++){
            for(int space = 1; space<=n-row;space++){
                System.out.print(" ");
            }
            for(int star = 1; star<=row;star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
import java.util.*;

public class ques4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row number till you want to print  pattern:");
        int n = sc.nextInt();
        char ch ='A';
        for(int row =1; row<=n;row++){
            for(int col = 1; col<=row;col++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}

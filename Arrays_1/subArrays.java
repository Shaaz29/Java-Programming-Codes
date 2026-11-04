// To print sub array from an array : 
import java.util.*;

public class subArrays {

    public static void subArr(int numbers[]){

        int totalSub = 0;
        for (int i = 0; i<numbers.length; i++){
            int start = i;
            for(int j = i; j < numbers.length;j++){
                int end = j;
                for(int k = start; k<=end; k++){  // printing
                    System.out.print(numbers[k]+" ");
                }
                totalSub++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total Sub arrays are :" + totalSub);
    }
    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10,12,14,16,18};
        subArr(numbers);
    }
}

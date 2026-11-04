import java.util.*;

public class pairsArray {

    //function to print pairs in array 
    // for example : 
    // (2,4),(2,6),(2,8),(2,10)
    // (4,6),(4,8),(4,10)
    // (6,8),(8,10)

    public static void pairsArr(int numbers[]){

        int totalPairs = 0;
        for(int i = 0; i< numbers.length; i++){
            int curr = numbers[i];
            for(int j = i+1; j<numbers.length; j++){
                System.out.print("(" + curr +" , "+ numbers[j] +")");
                totalPairs++;
            }
            System.out.println();
        }
        System.out.println("Total Pairs are: "+ totalPairs);
    }
    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10};
        pairsArr(numbers);
    }
}

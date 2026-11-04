import java.util.*;

public class largestinArr {

    public static int largeArr(int arr[]){
        // assign  -infinate value to largest 
        int largest = Integer.MIN_VALUE;
        for(int i = 0; i< arr.length; i++){
            if(arr[i]>largest){
                largest = arr[i];
            }
        }
            return largest;
    }
    public static void main(String[] args) {
        int arr[] ={1,4,6,10,17};
        System.out.println("largest number in array : " + largeArr(arr));
    }
}

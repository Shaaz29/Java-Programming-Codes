import java.util.*;

public class binarySearch {

    //function for binary search:
    public static int binSearch(int numbers[],int key){
        int start = 0;
        int end = numbers.length - 1;

        while(start<=end){
            int mid =(start+end)/2;

            //comparisons:
            if(numbers[mid]==key){  // key matched
                return mid;
            }
            if(numbers[mid] < key){ // it means we have to check right side of mid
                start = mid+1;
            }
            else{   //it means we have to check left side of mid
                end = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int numbers[]={2,4,6,8,10,12,14};
        int key = 22;
        System.out.println("index of key is : "+ binSearch(numbers, key));
    }
}

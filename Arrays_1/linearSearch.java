
public class linearSearch {

    //function to perform linear serach:
    public static int linSearch(int arr[],int key){
        for(int i = 0; i<arr.length; i++){
            if(arr[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] ={1,2,3,4,5,6,7,8,9,10};
        int key = 9;

        int index = linSearch(arr, key);
        if( index == -1){
            System.out.println("NOT FOUND");
        }else{
            System.out.println("Key is at index " + index);
        }
       
    }
}

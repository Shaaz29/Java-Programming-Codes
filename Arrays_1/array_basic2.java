import java.util.*;

public class array_basic2 {

    public static void update(int marks[], int nonChangable){

        nonChangable = 10;
        // loop for iterating through each element in marks: 
        for(int i = 0; i<marks.length; i++){
            marks[i] = marks[i] + 1; //updating marks value by 1
        }
    }
    public static void main(String[] args) {
        int marks[]= {97, 98, 99};
        int nonChangable = 5;
        update(marks,nonChangable);
        System.out.println(nonChangable);

        // for printing also we will use the loop :
        for(int i = 0; i<marks.length; i++){
            System.out.println("Updated marks " + marks[i]);
        }
    }
}

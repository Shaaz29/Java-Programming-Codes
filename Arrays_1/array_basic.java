import java.util.*;

public class array_basic {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // create an array of 10 subjects marks
    int marks[] = new int[10];

    System.out.println("Enter marks of physics , chemistry and maths");

    marks[0] = sc.nextInt(); // input physics marks
    marks[1] = sc.nextInt(); // input chemistry marks 
    marks[2] = sc.nextInt(); // input maths marks  

    System.out.println("Marks of physics:"+marks[0]); // printing physics marks
    System.out.println("Marks of chemistry:"+marks[1]); // printing chemistry marks
    System.out.println("Marks of maths:"+marks[2]); // printing maths marks

    // for printing length of array :
    System.out.println("Total subjects : " + marks.length);

    //for updating array . example update marks of maths by adding 5

    marks[2] = marks[2] + 5;
     System.out.println("Marks of maths after updating : "+marks[2]); // printing updated maths marks

     
    // calculate average : 
    int avg = (marks[0] + marks[1] + marks[2])/3;
    System.out.println("Average of marks is: "+ avg);
  }  
}

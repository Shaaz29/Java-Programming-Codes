// Question : Print this Hollow Rectangle Pattern in Java:

//      *****
//      *   *
//      *   *
//      ***** 


public class hollowRectPatt {

    public static void hollow_rectangle(int totRows, int totCols){
        //Outer loop
        for(int i = 1;i<=totRows; i++){
            //inner loop
            for(int j=1; j<=totCols; j++){
                // cell - (i, j)
                if(i==1 || i==totRows || j==1 || j==totCols){
                    //Boundary Cells
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        hollow_rectangle(5, 5);
    }
}

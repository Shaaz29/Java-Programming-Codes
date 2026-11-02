// Question: Print Floyd's Triangle: 

//  1
//  2  3
//  4  5  6
//  7  8  9  10
//  11 12 13 14 15


public class floydsTriangle {

    public static void floydTriangle(int rowNum){
        int counter = 1;
        //outer loop
        for(int i = 1; i<= rowNum; i++){
            //inner loop
            for(int j = 1; j <= i; j++){
                System.out.print(counter+" ");
                counter++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        floydTriangle(5);
    }
}

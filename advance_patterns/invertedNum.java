// Question : Inverted Half-Pyramid with Numbers

// 12345
// 1234
// 123
// 12
// 1

public class invertedNum {

    public static void numPyramid(int rowNum){
        //outer loop 
        for(int i= 1; i<=rowNum; i++){
            //inner loop
            for(int j = 1; j<=rowNum-i+1; j++){
                //printing numbers i.e column number here:
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        numPyramid(5);
    }
}

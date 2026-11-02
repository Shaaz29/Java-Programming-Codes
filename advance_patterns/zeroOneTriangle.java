// Question: 0-1 Triangle Pattern:

// 1
// 0 1
// 1 0 1
// 0 1 0 1
// 1 0 1 0 1



public class zeroOneTriangle {
        public static void zeroOneTrian(int rowNum){
        //outer loop
        for(int i = 1; i<= rowNum; i++){
            //inner loop
            for(int j = 1; j <= i; j++){
                if((i+j)%2 == 0){ //even
                   System.out.print(1+" ");
                }else{             //odd
                   System.out.print(0+" ");
                } 
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        zeroOneTrian(5);
    }
}

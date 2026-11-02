// Question: Inverted & Rotated Half Pyramid:

//        *
//       **
//      ***
//     ****


    public class invertpyramid {

        public static void inverted_pyramid(int rowNum){
            //outer loop
            for(int i =1 ; i<=rowNum; i++){
                //space printing 
                for(int space=1; space<=rowNum-i; space++){
                    System.out.print(" ");
                }
                //star printing
                for(int star =1; star<=i; star++){
                    System.out.print("*");
                }
                // next line
                System.out.println();
            }
        } 
       public static void main(String[] args) {
            inverted_pyramid(5);
       } 
}

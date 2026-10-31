// Question: Conversion from Decimal to Binary.

public class decToBin {

    public static void dectoBin(int decNum){
        int myNum = decNum;
        int binNum = 0;
        int power = 0;
        while(decNum > 0){
            int rem = decNum % 2;
            binNum = binNum + (rem*(int)Math.pow(10,power));
            power++; 
            decNum = decNum / 2;
        }
         System.out.println("Binary number of " + myNum + " is:"+ binNum);
    }
    public static void main(String[] args) {
        dectoBin(30);
    }
}

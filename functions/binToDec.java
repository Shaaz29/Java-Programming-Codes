// Question: Conversion from binary to decimal .



public class binToDec {

    public static void bintoDec(int binNum){
        int myNum = binNum;
        int power = 0;
        int decNum = 0;
        while(binNum>0){
            int lastDigit = binNum % 10;
            decNum = decNum + (lastDigit * (int)Math.pow(2,power));
            power++;
            binNum = binNum/10;
        }
    System.out.println("decimal of "+ myNum +" is: " + decNum);
    }
    public static void main(String[] args) {
        bintoDec(1010101);
    }
}

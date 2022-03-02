package week3;

public class armstrongNumbers {
    /*
    Write a method that can check if a number is Armstrong number
     */
    public static void main(String[] args) {
        System.out.println(isArmStrongNumber(153));//1^3+5^3^3=153  //1+125+27=153
    }
    public static boolean isArmStrongNumber(int num) {
        int a = 0, b = 0, c = num;

        while (num > 0) {
            a = num % 10;  //a=3     //a=5   //a=1
            num /= 10;     //num=15 //num=1 //num=0
            b = b + (a * a * a);//b=0+(3*3*3)=27 //b=27+(5*5*5)=152 //b=152+(1*1*1)=153
        }

        return (c == b) ? true : false; //153 == 153
    }

}

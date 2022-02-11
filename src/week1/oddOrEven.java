package week1;

public class oddOrEven {
    public static void main(String[] args) {
        //Write  a method which can identifies given number is even or odd

        System.out.println(identifyOddEven(5));
        System.out.println(identifyOddEven(6));
        identifyOddEven1(6);

    }
    public  static  String  identifyOddEven( int  n ) {
        return  n%2==0 ? "Even" : "odd" ;
    }

    public  static  void  identifyOddEven1( int  n ) {
        if(n%2==0){
            System.out.println("even");}
        else{
            System.out.println("odd");}
    }
}

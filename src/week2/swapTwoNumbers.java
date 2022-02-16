package week2;

public class swapTwoNumbers {
    public static void main(String[] args) {
        //Swap two variable' values without using a third variable

     /*  // Solution 1:
        int  a = 10;      int  b  = 20;
        a = a +b;
        b = a - b;
        a = a - b;*/

        //Solution 2:
        int  a = 10;      int  b  = 20;
        a = a^b;
        System.out.println(a);
        b = a^b;
        System.out.println(b);
        a = a^b;

    }
}

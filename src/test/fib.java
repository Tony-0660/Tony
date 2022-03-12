package test;

public class fib {
    public static void main(String[] args) {
        System.out.println(checkfibonacci(5));
    }
   public static String checkfibonacci(int n) {
        int a = 0;
        int b = 1;
        if (n==a || n==b) return "yes";
        int c = a+b;
        while(c<=n)
        {
            if(c == n) return "yes";
            a = b;
            b = c;
            c = a + b;
        }
        return "no";
    }
}

package popup;

public class fibonacci {
    // fib(3)  -> 0 1 1
    // fib(5)  -> 0 1 1 2 3
    // fib(6)  -> 0 1 1 2 3 5
    // fib(10) -> 0 1 1 2 3 5 8 13 21 34
    public static void main(String[] args) {
        fib(5);
    }

    public static void fib(int n) {
        int numOne = 0;
        int numTwo = 1;

        for(int i = 0; i < n; i++) {
            System.out.print(numOne + " ");

            int sum = numOne + numTwo;
            numOne = numTwo;
            numTwo = sum;
        }
    }
}

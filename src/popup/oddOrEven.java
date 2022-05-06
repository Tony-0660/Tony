package popup;

public class oddOrEven {
    public static void main(String[] args) {
    evenOrOdd(5);
    evenOrOdd(60);
    }

    public static void evenOrOdd(int num) {
        if(num % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}

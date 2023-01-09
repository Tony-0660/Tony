public class doSum {
    public static void doSum(Integer x, Integer y) {
        System.out.println("Integer sum is " + (x + y));
    }
    public static void doSum(byte x, byte y) {
        System.out.println("byte sum is " + (x + y));
    }
    public static void doSum(short x, short y) {
        System.out.println("short sum is " + (x + y));
    }
    public static void doSum(long x, long y) {
        System.out.println("long sum is " + (x + y));
    }
    public static void doSum(float x, float y) {
        System.out.println("float sum is " + (x + y));
    }
    public static void doSum(double x, double y) {
        System.out.println("double sum is " + (x + y));
    }

    public static void main(String[] args) {
        doSum(10, 20);
        doSum(10.0, 20.0);
    }

}

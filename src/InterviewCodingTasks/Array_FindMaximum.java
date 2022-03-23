package InterviewCodingTasks;

public class Array_FindMaximum {
    /*
        Write a function that can find the maximum number from an int Array
     */
    public static void main(String[] args) {
        System.out.println(maxValue(new int[]{5, 6, 9, 15}));
    }

    public static int maxValue(int[] n) {
        int max = Integer.MIN_VALUE;
        for (int each : n) {
            if (each > max) {
                max = each;
            }
        }
        return max;
    }
}

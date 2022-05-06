package popup;

import java.util.Arrays;

public class concat2Arrays {
    public static void main(String[] args) {
//Write a return method that can concate two arrays
        System.out.println(Arrays.toString(concatTwoArrays(new int[]{1, 2, 3}, new int[]{4, 5, 6})));
    }

    public static int[] concatTwoArrays(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length + arr2.length];
        int i = 0;
        for (int each : arr1) {
            result[i] = each;
            i++;
        }

        for (int each : arr2) {
            result[i] = each;
            i++;
        }
        return result;
    }
}

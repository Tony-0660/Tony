package InterviewCodingTasks;

import java.util.Arrays;

public class Array_MergeTwoArrays {
    public static void main(String[] args) {

        int[] arr3 = {4, 5, 6};
        int[] arr4 = {1, 2, 3};
       // concatTwoArrays(arr3, arr4);
        System.out.println(Arrays.toString(concatTwoArrays(arr3, arr4)));

    }

    /*
    Write a return method that can concat two arrays
     */

    public static int[] concatTwoArrays(int[] arr1, int[] arr2) {

        int[] result = new int[arr1.length + arr2.length];

        int i = 0;
        for (int each : arr1) {
            result[i++] = each;
        }

        for (int each : arr2) {
            result[i++] = each;
        }
        return result;
    }
}

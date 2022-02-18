package InterviewCodingTasks;

import java.util.ArrayList;


public class mergeDifferentTypeArrays {
    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3};
        char[] arr2 = {'a', 'b', 'c'};
        ArrayList<Object> result = merge(arr1, arr2);
        System.out.println(result);

    }

    public static ArrayList<Object> merge(int[] arr1, char[] arr2) {

        ArrayList<Object> merge = new ArrayList<>();

        for (int i : arr1) {
            merge.add(i);
        }

        for (char c : arr2) {
            merge.add(c);
        }
        return merge;
    }


}

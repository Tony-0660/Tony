package week7;

public class arrayFindMinimum {
    // Write a method that can find the maximum number from an int Array
    public static void main(String[] args) {
        System.out.println(maxValue(new int[] {150,5,8,9,15}));
    }

    public static int maxValue( int[]  n ) {
        int min = Integer.MAX_VALUE;
        for(int each: n)
            if(each < min)
                min = each;
        return min;
    }

}

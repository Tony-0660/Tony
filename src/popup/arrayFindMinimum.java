package popup;

public class arrayFindMinimum {
    // Write a method that can find the minimum  number from an int Array
    public static void main(String[] args) {
        System.out.println(minValue(new int[] {150,5,8,9,15}));
        int[] arr={5,8,65,9,1,56};
        int min=Integer.MAX_VALUE;
        for (int i = 0; i<arr.length-1;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println(min);
    }

    public static int minValue( int[]  n ) {
        int min = Integer.MAX_VALUE;
        for(int each: n)
            if(each < min)
                min = each;
        return min;
    }

}

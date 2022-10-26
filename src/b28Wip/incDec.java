package b28Wip;

public class incDec {
    public static void main(String[] args) {
        int num=0;
        num=num++;//first, starts with post inc. (right side of the = ) increase num value 1 more but only in the memory, still it's value is 0 at the moment.then goes left side of the = (assignment) sign and assign 0 value to num which overwrites the post inc. with this assignment and our num value remains 0 therefore num++ is like never used.
        num=num++;
        num=num++;

        int a=num;
        System.out.println("a = " + a);
        System.out.println("num = " + num);
    }

}

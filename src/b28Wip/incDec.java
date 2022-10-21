package b28Wip;

public class incDec {
    public static void main(String[] args) {
        int num=0;
        num=num++; //first goes to post inc., increase 1 in the memory but num value is still 0 at the moment.
        // then goes to the left side of the = sign and assign 0 (at the moment) to num which overwrites the post inc. with this assignment
        // and our num remains 0. therefore num++ is like never used

        int a=num;
        System.out.println(a);
        System.out.println(num);
        System.out.println ("\"Cydeo\" is best!");
        System.out.println("\"Cydeo\"" + " is the best!");
    }

}

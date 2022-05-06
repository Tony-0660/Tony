package popup;

public class palindrome {

    public static void main(String[] args) {

       isPalindrome("abcd");
       isPalindrome("abba");
       isPalindrome("abcdcba");
    }

    public static void isPalindrome(String str) {
        String reverse="";
        for(int i=str.length()-1; i >= 0; i--)
            reverse += str.toCharArray()[i];
        if (reverse.equalsIgnoreCase(str)){
            System.out.println( str+" is palindrome.");
        }else{
            System.out.println(  str+ " is not palindrome.");
        }

    }
}

package popup;

public class reverse {
   /* Write a return method that can reverse  String
    Ex: Reverse("ABCD"); ==> DCBA*/
   public static void main(String[] args) {
       System.out.println(Reverse("abcd"));
       System.out.println(StrReverse("abcd"));
       strrev("abd");
   }

   public static String StrReverse(String str) {
       String reverse="";
       for(int i=str.length()-1; i >= 0; i--)
           reverse += str.charAt(i);
       return  reverse;
   }
   public static void strrev(String str){
       String reverse="";
       for(int i=str.length()-1; i >= 0; i--)
           reverse += str.charAt(i);
       System.out.println(reverse);
   }
    public  static String  Reverse(String str) {
        return new StringBuffer(str).reverse().toString();
    }

}

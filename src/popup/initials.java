package popup;

public class initials {
    public static void main(String[] args) {
        initials(" chuck norris ");
        //C.N.
    }

    public static void initials(String str){
        str=str.toUpperCase().trim();
        str=str.charAt(0)+"."+str.charAt(str.indexOf(" ")+1)+".";
        System.out.println("Your initials = " + str);
    }
}

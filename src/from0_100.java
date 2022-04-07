import java.time.Month;

public class from0_100 {
    public static void main(String[] args) {

        //solution one
        String ten = "AaronCydeo";
        String nine= "AaronSDET";
        int one = ten.length() - nine.length(); //10-10=0
        int hundred = ten.length() * ten.length(); //10*10=100
        for (int i = one; i <= hundred; i++) {
            System.out.print(i+" ");
        }
        System.out.println("\n-----------------");

        //solution two
        int anotherOne = 'A' / 'A'; //65/65=1 ASCII
        for (int i = one; i <= (ten.length() * ten.length()); i++) {
            System.out.print(i+" ");
        }
        System.out.println("\n-----------------");

        //solution three
        for (int i = one; i <='d'; i++) { //'d'=100 ASCII
            System.out.print(i+" ");
        }
        System.out.println("\n-----------------");

        //solution four
        Month jan = Month.JANUARY;
        int newOne= jan.getValue();
        Month oct= Month.OCTOBER;
        int newTen=oct.getValue();
        for (int i = newOne; i <=(newTen*newTen); i++) {
            System.out.print(i+" ");
        }

    }
}


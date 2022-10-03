import java.time.Month;

public class from0_100 {
    public static void main(String[] args) {
        //Print from 1 to 100 without using any numbers in your code:
        //solution one
        String ten = "AaronCydeo";
        String nine = "AaronSDET";
        int one = ten.length() - nine.length(); //10-9=1
        int hundred = ten.length() * ten.length(); //10*10=100
        for (int i = one; i <= hundred; i++) {
            System.out.print(i + " ");
        }
        System.out.println("\n-----------------");

        //solution two
        int anotherOne = 1; //97/97=1 ASCII
        for (int i = anotherOne; i <= (ten.length() * ten.length()); i++) {
            System.out.print(i + " ");
        }
        System.out.println("\n-----------------");

        //solution three
        for (int i = anotherOne; i <= 'd'; i++) { //'d'=100 ASCII
            System.out.print(i + " ");
        }
        System.out.println("\n-----------------");

        //solution four
        Month jan = Month.JANUARY;
        int newOne = jan.getValue();
        Month oct = Month.OCTOBER;
        int newTen = oct.getValue();
        for (int i = newOne; i <= (newTen * newTen); i++) {
            System.out.print(i + " ");
        }

        System.out.println("\n-----------------");

        //solution five
        int oneA = 'x' - 'x';
        while (Integer.toString(oneA++).length() < "XXX".length()) {
            System.out.print(oneA + " ");
        }
    }
}


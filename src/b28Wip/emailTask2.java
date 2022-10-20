package b28Wip;

import java.util.Scanner;

public class emailTask2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your email:");
        String email = input.next();

        String firstName = email.substring(0, 1).toUpperCase() + email.substring(1, email.indexOf('_'));
        String lastName = email.substring(email.indexOf('_') + 1, email.indexOf('_') + 2).toUpperCase() + email.substring(email.indexOf('_') + 2, email.indexOf('@'));
        String domain = email.substring(email.indexOf('@') + 1, email.indexOf("."));

        System.out.println("First name: " + firstName + "\nLast name: "
                + lastName + "\nDomain: " + domain);

        input.close();
    }
}

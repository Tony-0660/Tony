package week5;

import java.util.Arrays;

public class sortLettersNumbers {
    /*Given alphanumeric String, we need to split the string into substrings of consecutive letters or numbers, sort the individual string and append them back together
Ex:
Input:  "DC501GCCCA098911"
OutPut: "CD015ACCCG011899"*/
    public static void main(String[] args) {
        System.out.println(SortLettersAndNumbersFromString("DC501GCCCA098911"));
    }
    public static String SortLettersAndNumbersFromString(String str) {

        String str2 = "";

        for (int i = 0; i < str.length(); i++) {
            str2 += "" + str.charAt(i);
            if (Character.isAlphabetic(str.charAt(i)) && i < str.length() - 1) {
                if (Character.isDigit(str.charAt(i + 1))) {
                    str2 += ",";
                }
            }
            if (Character.isDigit(str.charAt(i)) && i < str.length() - 1) {
                if (Character.isAlphabetic(str.charAt(i + 1))) {
                    str2 += ",";
                }
            }
        }
        System.out.println(str2);
        String[] arr = str2.split(",");
        str = "";

        for (String each : arr) {
            char[] chars = each.toCharArray();
            Arrays.sort(chars);
            for (char eachChar : chars) {
                str += "" + eachChar;
            }
        }
        return str;
    }
}

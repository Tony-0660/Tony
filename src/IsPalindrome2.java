public class IsPalindrome2 {
    public static void main(String[] args) {
        String[] words = {"anna", "level ", "Java", "civiC"};
        int count = 0;
        for (String eachWord : words) {

            boolean isPalindrome = true;
            for (int i = 0; i < eachWord.length() / 2; i++) {
                if (eachWord.charAt(i) != eachWord.charAt(eachWord.length() - 1 - i)) {
                    isPalindrome = false;
                    break;
                }
            }
            if (isPalindrome) {
                count++;
            }

        }
        System.out.println(count);
    }
}

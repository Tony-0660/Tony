public class dr {
    static String findLongestPalindrome(String str) {
        // to stores freq of characters in a string
        int count[] = new int[256];

        // find freq of characters in the input string
        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i)]++;
        }

        // Any palindromic string consists of three parts
        // beg + mid + end
        String beg = "", mid = "", end = "";

        // solution assumes only lowercase characters are
        // present in string. We can easily extend this
        // to consider any set of characters
        for (char ch = 'a'; ch <= 'z'; ch++) {
            // if the current character freq is odd
            if (count[ch] % 2 == 1) {
                // mid will contain only 1 character. It
                // will be overridden with next character
                // with odd freq
                mid = String.valueOf(ch);

                // decrement the character freq to make
                // it even and consider current character
                // again
                count[ch--]--;
            } // if the current character freq is even
            else {
                // If count is n(an even number), push
                // n/2 characters to beg string and rest
                // n/2 characters will form part of end
                // string
                for (int i = 0; i < count[ch] / 2; i++) {
                    beg += ch;
                }
            }
        }

        // end will be reverse of beg
        end = beg;
        end = reverse(end);

        // return palindrome string
        return beg + mid + end;
    }

    static String reverse(String str) {
        // convert String to character array
        // by using toCharArray
        String ans = "";
        char[] try1 = str.toCharArray();

        for (int i = try1.length - 1; i >= 0; i--) {
            ans += try1[i];
        }
        return ans;
    }

    // Driver code
    public static void main(String[] args) {
        String str = "abbaccd";
        System.out.println(findLongestPalindrome(str));
    }
}

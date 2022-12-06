package Week12;

import javax.xml.stream.events.Characters;
import java.util.HashMap;
import java.util.Map;

public class MapUniqueCharString {
    /*Find Unique Characters of a string and put them in a map with the number of occurrences as 1
    For example:
            “aabccddeffft”
    {b=1,e=1,t=1}*/

    public static void main(String[] args) {

        String str = "accabbcd";
        Map<Character, Integer> unique = new HashMap<>();

        for( int j = 0; j < str.length(); j++) {
            int count =0;
            for (int i = 0; i < str.length(); i++) {
                if(str.charAt(i) == str.charAt(j))
                    count++;
            }
            if( count == 1){
                unique.put(str.charAt(j), count);
            }
        }

        System.out.println(unique);

    }
}

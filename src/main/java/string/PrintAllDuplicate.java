package string;

import java.util.HashMap;
import java.util.Map;

public class PrintAllDuplicate {

    // Solution 1: Using Hashmap
    public static void printAllDuplicates(String str){
        HashMap< Character, Integer > map = new HashMap < Character, Integer > (26);

        for (int i = 0; i < str.length(); i++)
            map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0) + 1);

        for (Map.Entry < Character, Integer > entry: map.entrySet())
            if (entry.getValue() > 1)
                System.out.println(entry.getKey() + " - " + entry.getValue());
    }

    // Solution 2: using array
    // We can also think of another approach, since the string is going to contain only a – z characters, we don’t even
    // need a HashMap. Instead, we can use an array to store the count values.
    public static void printAllDuplicate(String str){
        int[] counts = new int[26];

        for (int i = 0; i < str.length(); i++)
            counts[str.charAt(i) - 'a']++;

        for (int i = 0; i < 26; i++)
            if (counts[i] > 1)
                System.out.println((char)(i + 'a') + " - " + counts[i]);
    }

    public static void main(String[] args) {
        PrintAllDuplicate.printAllDuplicates("cbacdcbc");
    }
}

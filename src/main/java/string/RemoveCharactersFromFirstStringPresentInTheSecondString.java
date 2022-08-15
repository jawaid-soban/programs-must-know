package string;

import java.util.HashMap;

public class RemoveCharactersFromFirstStringPresentInTheSecondString {

    // Solution 1 : Naive
    public static String remove(String s1, String s2){

        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < s1.length(); i++){
            int flag = 0;
            for (int j= 0; j< s2.length(); j++){
                if(s1.charAt(i) == s2.charAt(j))
                    flag = 1;
            }
            if(flag != 1)
                sb.append(s1.charAt(i));
        }
        return sb.toString();
    }

    // Solution 2 : Optimised
    public static String remove2(String str1, String str2){

        HashMap< Character, Integer > mp = new HashMap < > ();
        StringBuffer ans = new StringBuffer();
        for (int i = 0; i < str2.length(); i++) {
            mp.put(str2.charAt(i), 1);
        }
        for (int i = 0; i < str1.length(); i++) {
            if (mp.get(str1.charAt(i)) == null)
                ans.append(str1.charAt(i));
        }
        return ans.toString();
    }

    public static void main(String[] args) {
        String str1 = "abcdef";
        String str2 = "cefz";
        System.out.println(
                RemoveCharactersFromFirstStringPresentInTheSecondString.remove(str1, str2));
    }
}

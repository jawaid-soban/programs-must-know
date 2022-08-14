package string;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FrequencyOfCharacters {

    public static String frequencyOfCharacters(String str){
        Map<Character, Integer> map = new HashMap();
        for(int i= 0; i<str.length(); i++){
            char c = str.charAt(i);
            if(map.containsKey(c))
                map.put(c, map.get(c) + 1);
            else
                map.put(c, 1);
        }
        return map.toString();
    }

    // 2nd way, first sort the str and then count
    public static String sortString(String str){
        char[] arr = str.toCharArray();
        Arrays.sort(arr);
        return new String(arr);
    }

    public static void frequencyCount2(String str){
        str = sortString(str);
        char c = str.charAt(0);
        int count = 1;
        for(int i = 1; i< str.length(); i++){
            if(c == str.charAt(i)){
                count++;
            } else {
                System.out.print(c);
                System.out.print(count + " ");
                c = str.charAt(i);
                count = 1;
            }
        }
        System.out.print(c);
        System.out.print(count + " ");
    }

    public static void main(String[] args) {
        String str = "takeuforward";
        System.out.println(FrequencyOfCharacters.frequencyOfCharacters(str));
        FrequencyOfCharacters.frequencyCount2(str);
    }
}

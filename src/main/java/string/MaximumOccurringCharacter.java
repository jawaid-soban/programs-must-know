package string;

import java.util.Arrays;

public class MaximumOccurringCharacter {

    public static char maxOccurringChar(String s){
        char maxChar = 'a';
        int maxCount = 1;
        int[] count = new int[256];
        for(int i = 0; i<s.length();i++){
            count[(int) s.charAt(i)]++;
            if(count[(int) s.charAt(i)] > maxCount){
                maxChar = s.charAt(i);
                maxCount = (int) s.charAt(i);
            }
        }
        return maxChar;
    }

    // Solution 2 : Sorting
    // Approach: Sort the array so that more than one copy of a character will occupy contiguous positions.
    // We maintain two variables : curr_freq, max_freq

    public static char maxOccurringChar2(String str){
        char ans = str.charAt(0);
        int i, curr_freq = 0, max_freq = 0, n = str.length();
        for (i = 1; i < n; i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                curr_freq++;
            }
            else {
                if (max_freq < curr_freq) {
                    max_freq = curr_freq;
                    ans = str.charAt(i - 1);
                }
                curr_freq = 0;
            }
        }
        if (max_freq < curr_freq) {
            max_freq = curr_freq;
            ans = str.charAt(i - 1);
        }
        return ans;
    }

    public static char[] sort(char[] arr){
        Arrays.sort(arr);
        return arr;
    }

    public static void main(String[] args) {
        System.out.println(MaximumOccurringCharacter.maxOccurringChar("apple"));
        String str = "takeuforward";
        //convert to character array
        char charArr[] = str.toCharArray();
        //sort the character array
        Arrays.sort(charArr);
        //sorted character array converted back to string
        str = new String(charArr);
        System.out.println(MaximumOccurringCharacter.maxOccurringChar2(str));
    }
}

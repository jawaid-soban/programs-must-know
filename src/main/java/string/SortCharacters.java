package string;

import java.util.Arrays;

public class SortCharacters {

    // Approach 1
    public static String sortChar(String str){
        char[] arr = str.toCharArray();
        int n = arr.length;
        // bubble sort
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                // swap
                if (arr[j] > arr[j + 1]) {
                    char temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        String ans = new String(arr);
        return ans;
    }

    // Approach 2
    public static String solve(String str) {
        char[] char_arr = str.toCharArray();
        Arrays.sort(char_arr);
        // Creating object of String class
        String ans = new String(char_arr);
        return ans;
    }

    public static void main(String[] args) {
        String s = "zxcbg";
        System.out.println(SortCharacters.sortChar(s));
    }
}

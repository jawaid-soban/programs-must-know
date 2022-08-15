package string;

import java.util.Arrays;

public class Anagram {

    // Solution 1
    // Approach: Sort both the string and compare each and every letter of both strings. If all letters matched then, print true. Otherwise, print false.
    public static boolean isAnagram(String str1, String str2){

        if (str1.length() != str2.length())
            return false;

        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        arr1 = sort(arr1);
        arr2 = sort(arr2);

        for (int i = 0; i< arr1.length; i++){
            if(arr1[i] == arr2[i])
                return false;
        }
        return true;
    }

    public static char[] sort(char[] arr){
        Arrays.sort(arr);
        return arr;
    }

    // Solution 2
    //Approach: Just count the frequency of every element in Str1 and iterate through Str2 and decrease the count of
    // every element in the frequency array. Now iterate again, if the frequency at any point is not 0 this means,
    // strings are not anagrams of each other.

    public static boolean isAnagram2(String s1, String s2){

        int[] freq = new int[26];
        for (int i = 0; i< s1.length();i++){
            freq[(int) s1.charAt(i) - 'A']++;
        }
        for (int i = 0; i< s2.length(); i++){
            freq[(int) s2.charAt(i) - 'A']--;
        }
        for (int i = 0; i< freq.length; i++){
            if(freq[i] != 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String s1 = "RULES";
        String s2 = "LESRT";
        System.out.println(Anagram.isAnagram2(s1, s2));
    }
}

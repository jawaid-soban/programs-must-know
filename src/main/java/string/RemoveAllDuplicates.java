package string;

public class RemoveAllDuplicates {

    // Solution 1 : Brute Force
    public static String removeDuplicates(String s){
        String ans = "";
        for (int i = 0; i < s.length(); i++) {
            int j = 0;
            for (j = 0; j < i; j++) {
                if (s.charAt(i) == s.charAt(j)) //same character found
                {
                    break;
                }
            }
            if (i == j) {
                ans += s.charAt(i);
            }
        }
        return ans;
    }

    public static String removeDuplicates2(String s){
        String res = "";
        boolean[] map = new boolean[26];
        for (int i = 0; i< s.length(); i++){
            if(map[s.charAt(i) - 'a'] == false){
                res += s.charAt(i);
                map[s.charAt(i) - 'a'] = true;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(RemoveAllDuplicates.removeDuplicates("cbacdcbc"));
        System.out.println(RemoveAllDuplicates.removeDuplicates2("cbacdcbc"));
    }
}

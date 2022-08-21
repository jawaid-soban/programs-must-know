package string;

public class ChangeCaseOfEachCharacter {


    // Approach 1
    public static String changeCase(String str){
        int n = str.length();
        StringBuffer ans = new StringBuffer();
        for (int i = 0; i < n; i++) {
            int ascii = (int) str.charAt(i);

            if (ascii >= 65 && ascii <= 90)
                ans.append((char)(ascii + 32));

            else if (ascii >= 97 && ascii <= 122)
                ans.append((char)(ascii - 32));

            else if (str.charAt(i) == ' ')
                ans.append(' ');
        }

        return ans.toString();
    }


    // Approach 2
    public static String changeCase2(String str){
        int n = str.length();
        StringBuffer ans = new StringBuffer();
        for (int i = 0; i < n; i++) {
            int ascii = (int) str.charAt(i);

            if (ascii >= 65 && ascii <= 90) // if uppercase
                ans.append(Character.toLowerCase((char) ascii));

            else if (ascii >= 97 && ascii <= 122) // if lowercase
                ans.append(Character.toUpperCase((char) ascii));

            else if (str.charAt(i) == ' ') // if whitespace
                ans.append(' ');
        }

        return ans.toString();
    }
    public static void main(String[] args) {
        String s = "take u forward IS Awesome";
        System.out.println(
                ChangeCaseOfEachCharacter
                .changeCase(s));
    }
}

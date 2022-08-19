package string;

public class ChangeEveryLetterWithNextLexicographicAlphabet {

    public static String change(String s){
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i<s.length(); i++){
            if((int) s.charAt(i) == 122)
                sb.append('a');
            else if ((int) s.charAt(i) == 90)
                sb.append('A');
            else
                sb.append((char)(s.charAt(i) + 1));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "abcdxyz";
        System.out.println(
                ChangeEveryLetterWithNextLexicographicAlphabet.change(str)
        );
    }
}

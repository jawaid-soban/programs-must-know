package string;

public class PositionOfASubstring {

    public static int positionOfSubstring(String text, String pattern){
        int res = 0;
        //Approach 1
        res = text.indexOf(pattern);

        //Approach 2
        int N = text.length();
        int M = pattern.length();

        for (int i = 0; i < N; i++) {
            int temp = i;
            int j = 0;
            for (j = 0; j < M; j++) {
                if (text.charAt(temp) != pattern.charAt(j)) {
                    break;
                }
                temp++;
            }
            if (j == M) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        String s1 = "takeuforward";
        String s2 = "forward";
        System.out.println(
                PositionOfASubstring.positionOfSubstring(s1, s2)
        );
    }
}

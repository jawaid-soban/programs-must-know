package string;

public class WordWithHighestNumberOfRepeatedLetters {

    public static String wordWithHighestNumberOfRepeatedLetters(String str){

        int len = str.length() ;

        int maximumword = 0 ;

        int curr_maximumword = 0  ;

        String result = ""  ;


        for (int left = 0; left < len;) {

            int right = left + 1 ;
            while (right < len && str.charAt(right) != ' ') {
                right++ ;
            }

            int frequency[]=new int[26]  ;
            curr_maximumword = 0  ;

            for (int index = left ; index < right ; index++) {
                frequency[str.charAt(index) - 'a']++  ;
            }
            for (int index = 0 ; index < 26 ; index++) {
                if (frequency[index] > 1) {
                    curr_maximumword ++  ;
                }
            }


            if (curr_maximumword > maximumword) {
                maximumword = curr_maximumword ;
                result = ""  ;
                for (int j = left ; j < right ; j++)
                    result += str.charAt(j) ;

            }

            left = right + 1  ;
        }

        if (result.equals("")) {
            return "-1";
        }
        else {
            return  result;
        }
    }
    public static void main(String[] args) {

        String s = "abcdefghij google microsoft";
        System.out.println(
                WordWithHighestNumberOfRepeatedLetters
                        .wordWithHighestNumberOfRepeatedLetters(s)
        );
    }
}

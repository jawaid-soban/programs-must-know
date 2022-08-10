package string;

public class RemoveSpaces {

    public static String removeSpaces(String str){
        for (int i = 0; i<str.length(); i++){
            if(str.charAt(i) == ' '){
                str = str.substring(0, i) + str.substring(i + 1);
                i--;
            }
        }
        return str;
    }

    public static void main(String[] args) {
        System.out.println(RemoveSpaces.removeSpaces("hi there"));
    }
}

package string;

public class RemoveCharacterExceptAlphabet {

    public static String removeCharacterExceptAlphabet(String str){
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < str.length(); i++){
            int ascii = (int) str.charAt(i);
            if((ascii >= 65 && ascii <=90) || (ascii >= 97 && ascii <= 122)){
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(RemoveCharacterExceptAlphabet.removeCharacterExceptAlphabet("take12% *&u ^$#forward"));
    }
}

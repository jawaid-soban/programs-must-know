package string;

public class RemoveBrackets {

    public static String removeBrackets(String str){
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i< str.length(); i++){
            if(str.charAt(i) != '(' && str.charAt(i) != ')')
                sb.append(str.charAt(i));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(RemoveBrackets.removeBrackets("a+((b-c)+d)"));
    }
}

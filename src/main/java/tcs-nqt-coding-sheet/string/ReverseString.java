package string;

import java.util.Stack;

public class ReverseString {

    public static String reverseString(String str){
        StringBuffer sb = new StringBuffer();
        Stack s =  new Stack();
        for(int i = 0; i < str.length(); i++){
            s.push(str.charAt(i));
        }

        for(int i = 0; i < str.length(); i++){
            sb.append(s.pop());
        }
        return sb.toString();
    }

    public static String reverseString2(String str){
        char[] reverseString = new char[str.length()];
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < str.length(); i++) {

            stack.push(str.charAt(i));
        }
        int i = 0;
        while (!stack.isEmpty()) {

            reverseString[i++] = stack.pop();
        }
        str = new String(reverseString);
        return str;
    }

    public static String reverseTwoPointer(String str){
        int i = 0;
        int j = str.length() - 1;
        while(i<j){
            str = swap(str, i, j);
            i++;
            j--;
        }
        return str;
    }

    public static String swap(String str, int i, int j){
        StringBuilder sb = new StringBuilder(str);
        char temp = str.charAt(i);
        sb.setCharAt(i, str.charAt(j));
        sb.setCharAt(j, temp);
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(ReverseString.reverseString("HELLO"));
        System.out.println(ReverseString.reverseTwoPointer("HELLO"));

    }
}

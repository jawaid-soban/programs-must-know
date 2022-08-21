package string;

import java.util.Stack;

public class ReverseWordsInAString {

    // Approach 1 : Brute Force
    // Use a stack to push all the words in a stack
    // Now, all the words of the string are present in the stack, but in reverse order
    // Pop elements of the stack one by one and add them to our answer variable.
    // Remember to add a space between the words as well.
    public static String reverse(String s){

        s += " ";
        Stack<String> st = new Stack<String>();
        int i;
        String str = "";
        for (i = 0;i < s.length();i++)
        {
            if (s.charAt(i) == ' ')
            {
                st.push(str);
                str = "";
            }
            else
            {
                str += s.charAt(i);
            }
        }
        String ans = "";
        while (st.size() != 1)
        {
            ans += st.peek() + " ";
            st.pop();
        }
        ans += st.peek(); // The last word should'nt have a space after it
        return ans;
    }

    // Approach 2: Better Solution
    public static String reverse2(String s){
        int left = 0;
        int right = s.length() - 1;

        String temp = "";
        String ans = "";

        //Iterate the string and keep on adding to form a word
        //If empty space is encountered then add the current word to the result
        while (left <= right)
        {
            char ch = s.charAt(left);
            if (ch != ' ')
            {
                temp += ch;
            }
            else if (ch == ' ')
            {
                if (!ans.equals(""))
                {
                    ans = temp + " " + ans;
                }
                else
                {
                    ans = temp;
                }
                temp = "";
            }
            left++;
        }

        //If not empty string then add to the result(Last word is added)
        if (!temp.equals(""))
        {
            if (!ans.equals(""))
            {
                ans = temp + " " + ans;
            }
            else
            {
                ans = temp;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        String str = "this is an amazing program";
        System.out.println(
                ReverseWordsInAString.reverse(str)
        );
    }
}

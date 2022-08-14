package string;

public class CheckPalindrome {

    public static boolean isPalindromeIterative(String str){
        char[] arr = str.toCharArray();
        for(int i = 0; i< arr.length / 2; i++){
            if(arr[i] != arr[arr.length - i - 1])
                return false;
        }
        return true;
    }

    public static boolean isPalindromeRecursive(String str){
        int n = str.length();
        if(n == 0)
            return true;
        return isPalRec(str, 0 , n-1);
    }

    private static boolean isPalRec(String str, int s, int e) {
        // If there is only one character
        if(s == e)
            return true;
        // If first and last characters do not match
        if(str.charAt(s) != str.charAt(e))
            return false;
        // If there are more than two characters, check if middle substring is also palindrome or not.
        if(s < e + 1)
            isPalRec(str, s+1, e-1);

        return true;
    }

    public static void main(String[] args) {
        String str = "abccba";
        System.out.println("String "+ str + " is palindrome : " + CheckPalindrome.isPalindromeIterative(str));
        System.out.println("String "+ str + " is palindrome : " + CheckPalindrome.isPalindromeRecursive(str));
    }
}

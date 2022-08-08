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

        return false;
    }

    public static void main(String[] args) {
        String str = "abccba";
        System.out.println("String "+ str + " is palindrome : " + CheckPalindrome.isPalindromeIterative(str));
    }
}

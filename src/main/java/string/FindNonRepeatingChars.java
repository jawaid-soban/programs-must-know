package string;

public class FindNonRepeatingChars {

    // Solution1: Naive Approach
    static void nonRepeating(String st, int n) {
        int freq[] = new int[200];
        char s[] = st.toCharArray();

        for (int i = 0; i < n; i++) {
            freq[i] = 1;
            for (int j = i + 1; j < n; j++) {
                if (s[i] == s[j]) {
                    freq[i]++;

                    s[j] = '-'; // set s[j] to 0 to avoid printing visited character
                }
            }
        }

        for (int i = 0; i < n; ++i) {
            if (freq[i] == 1 && s[i] != ' ' && s[i] != '-') {
                System.out.print(s[i] + " ");
            }
        }
    }


    // Solution2: Linear Approach

    public static void nonRepeatingChar(String st, int n){

        int freq[] = new int[200];
        char s[] = st.toCharArray();
        for (int i = 0; i < n; i++) {
            System.out.println("--"+(int) st.charAt(i));
            if (st.charAt(i) == ' ') // ignoring the space in the string
                continue;
            else
                freq[(int) st.charAt(i)]++;//incrementing each character's frequency
        }

        // Printing the frequency of the string
        for (int i = 0; i < n; i++) {
            if (freq[(int) st.charAt(i)] == 1 && s[i] != ' ') {
                System.out.print(s[i] + " ");
            }
        }
    }


    public static void main(String[] args) {

        String str = "google";
        int n = str.length();
        FindNonRepeatingChars.nonRepeating(str, n);
        FindNonRepeatingChars.nonRepeatingChar(str, n);

    }
}

package string;

public class ConcatenateOneStringToAnother {

    public static String concatenate(String s1, String s2){

        // Approach 1
        String result = s1.concat(s2);
        // Approach 2
        result = s1 + s2;
        StringBuffer sbResult = new StringBuffer(s1);
        sbResult.append(s2);
        // Approach 3
        result = sbResult.toString();

        // Approach 4
        char[] str1 = {'H', 'e', 'l', 'l', 'o'};
        char[] str2 = {'W', 'o', 'r', 'l', 'd'};

        int n = str1.length;
        int m = str2.length;

        char[] dest = new char[n+m];



        for(int i=0;i<n;i++){
            dest[i] = str1[i];
        }

        for(int j=0; j<m; j++){
            dest[j+n]= str2[j];
        }

        result = new String(dest);

        return result;
    }

    public static void main(String[] args) {

    }
}

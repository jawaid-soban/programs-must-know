package string;

public class CapitalizeFirstAndLast {

    public static String capitalizeFirstAndLast(String str, int size){
        StringBuffer sb =new StringBuffer(str);
        for (int i = 0; i < size; i++) {

            if (i == 0 || i == (size - 1) && (int) str.charAt(i) >= 97)
                //Converting first and last index character to uppercase
            {
                sb.setCharAt(i, (char)((int) str.charAt(i) - 32));
            } else if (str.charAt(i) == ' ')
                // Converting characters present before and after space to uppercase
            {
                if (((int) str.charAt(i - 1) - 32) >= 65) // Already not an uppercase letter
                    sb.setCharAt(i - 1, (char)((int) str.charAt(i - 1) - 32));

                if (((int) str.charAt(i + 1) - 32) >= 65) // Already not an uppercase letter
                    sb.setCharAt(i + 1, (char)((int) str.charAt(i + 1) - 32));
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "take u forward is awesome";
        int size = str.length();
        System.out.println(CapitalizeFirstAndLast.capitalizeFirstAndLast(str, size));
    }
}

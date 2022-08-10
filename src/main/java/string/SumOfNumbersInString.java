package string;

public class SumOfNumbersInString {

    public static int sumOfNumInString(String str){
        int sum = 0;
        String tempSum = "0";
        for(int i = 0; i<str.length(); i++){
            char s = str.charAt(i);
            if(Character.isDigit(s)){
                tempSum += s;
            } else {
                sum += Integer.parseInt(tempSum);
                tempSum = "0";
            }
        }
        return sum + Integer.parseInt(tempSum);
    }

    public static void main(String[] args) {
        System.out.println(SumOfNumbersInString.sumOfNumInString("123xyz"));
        System.out.println(SumOfNumbersInString.sumOfNumInString("1xyz23"));
    }
}

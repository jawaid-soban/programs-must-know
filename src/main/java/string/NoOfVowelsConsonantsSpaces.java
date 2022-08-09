package string;

public class NoOfVowelsConsonantsSpaces {

    public static void count(String str){
        int vowel = 0;
        int cons = 0;
        int spc = 0;
        char[] arr = str.toCharArray();
        for(int i=0; i<arr.length;i++){
            if(arr[i] == 'a' || arr[i] == 'e' || arr[i] == 'i' || arr[i] == 'o' || arr[i] == 'u')
                vowel++;
            else if(arr[i] >= 'a' && arr[i] <= 'z')
                cons++;
            else if(arr[i] == ' ')
                spc++;
        }
        System.out.println("vowels : " + vowel);
        System.out.println("cons : " + cons);
        System.out.println("spc : " + spc);
    }

    public static void main(String[] args) {
        NoOfVowelsConsonantsSpaces.count("Take u forward is Awesome");
    }
}

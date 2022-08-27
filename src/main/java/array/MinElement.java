package array;

public class MinElement {

    public static int minElement(int[] arr){
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {
        int arr[] = {2,5,1,3,4};
        System.out.println(MinElement.minElement(arr));
    }
}

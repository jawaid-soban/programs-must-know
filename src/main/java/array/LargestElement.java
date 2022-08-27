package array;

public class LargestElement {

    public static int largestElement(int[] arr){
        int largest = 0;
        for(int i = 0; i< arr.length; i++){
            if(arr[i] > largest)
                largest = arr[i];
        }
        return largest;
    }

    public static void main(String[] args) {
        int arr[] = {2,5,1,3,0};
        System.out.println(LargestElement.largestElement(arr));
    }
}

import java.util.Arrays;

public class BubbleSort {

    static void bubble(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j =1; j < arr.length - i; j++) {
                if (arr[j] <arr[j-1]) {
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }
    } 
    public static void main(String[] args) {

        int [] arr = {5,4,3,2,1};
        int [] arr2 = {51,44,35,221,11};
        
        bubble(arr);
        bubble(arr2);

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));
    }
}
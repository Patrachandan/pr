
public class arrayReverse {
    public static void reverseArray(int[] arr, int start, int end){
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++; 
            end--;
        }
        for(int i=0; i< arr.length; i++){
            System.out.print(arr[i]);
        }
    }

    public static void main(String[] args) {
        int[] arr = {7,6,5,4,3,2,1};
        reverseArray(arr, 0, arr.length-1);
    }
}

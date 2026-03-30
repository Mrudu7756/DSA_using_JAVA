public class reverse_array2 {

    static void swapInArray(int[] arr, int i, int j){
        int temp;
        temp = arr[i];
        arr[i] = arr[j];;
        arr[j] = temp;
    }
    static void reverArray(int[] arr){
        int i = 0, j = arr.length-1;
        while( i < j){
            swapInArray(arr, i , j);
            i++;
            j--;
        }
    }
    public static void main(String args[]){
        int[] arr = {2, 5, 7 , 8, 9};
        reverArray(arr);
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    
}

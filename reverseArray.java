public class reverseArray {

    static int[] rever(int [] arr){
        int n = arr.length;
        int[] ans = new int[n];
        int j = 0;
        System.out.println("Array before reverse:");
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i] + " ");
        }
        System.out.println("array after reverse:");
        for(int i = n-1; i >= 0; i--){
            ans[j++] = arr[i];
        }
        return ans;
    }
    public static void main(String args[]){
        int[] arr = {2, 5, 7 , 8, 9};
        int[] ans = rever(arr);
        for(int i = 0; i < ans.length; i++){
            System.out.println(ans[i] +" ");
        }
    }
}

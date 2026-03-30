import java.util.Scanner;

public class arrayManipulation_2 {

    static int findSecondLargest(int[] arr)
    {
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;

    }
    static int secondMax(int[] arr)
    {
        int max = findSecondLargest(arr);
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == max){
                arr[i] = Integer.MIN_VALUE;
            }
        }
        int secondMax2 = findSecondLargest(arr);
        return secondMax2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the "+ n +  " Array element:");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Second Maximum "+secondMax(arr));
    }
}

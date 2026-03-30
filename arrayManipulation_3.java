import java.util.Scanner;

public class arrayManipulation_3 {

    static int repeat(int[] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1; j < arr.length; j++){
                if(arr[i]==arr[j])
                {
                    return arr[i];
                }
            }
        }
        return -1;k
    }
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the size of array:");
      int n = sc.nextInt();
      int[] arr = new int[n];
      System.out.println("Enter the " + n + " Array element:");

      for(int i = 0; i < n; i++) {
         arr[i] = sc.nextInt();
      }

      System.out.println(repeat(arr));
   }
}

import java.util.*;
public class twoD_arrayExample {

    static void printArray(int[][] arr){
        System.out.println("The element of array:");
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j] +" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int row, cols;
        System.out.println("enter the number of rows:");
        row = sc.nextInt();
        System.out.println("enter the number of cols:");
        cols = sc.nextInt();
        int[][] arr = new int[row][cols];
        System.out.println("Enter the array element:");
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        printArray(arr);
    }
}

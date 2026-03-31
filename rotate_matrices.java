import java.util.Scanner;

public class rotate_matrices {
    static void printArray(int[][] a){
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[i].length; j++){
                System.out.print(a[i][j] +" ");
            }
            System.out.println();
        }
    }

    static void transposeInPlace(int[][] a, int r, int c){
        for(int i = 0; i < c; i++){
            for(int j = i; j < r; j++){
                int temp = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = temp;
            }
        }
    }

    static void reverseArray(int[] arr){
        int i = 0, j = arr.length-1;
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    static void rotate(int[][] a, int n){
        transposeInPlace(a, n, n);
        for(int i = 0; i < n; i++){
            reverseArray(a[i]);
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int r, c;
        System.out.println("enter the number of rows:");
        r = sc.nextInt();
        System.out.println("enter the number of cols:");
        c = sc.nextInt();
        int[][] a = new int[r][c];
        System.out.println("Enter the array element:");
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
               a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Input Matrices:");
        printArray(a);

        rotate(a, c);

        System.out.println("rotate Matrices:");
        printArray(a);
    }
}

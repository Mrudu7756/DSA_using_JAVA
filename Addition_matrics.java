import java.util.Scanner;

public class Addition_matrics {

    static void printArray(int[][] arr){
        System.out.println("The element of array:");
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j] +" ");
            }
            System.out.println();
        }
    }

    static void add(int[][] a, int r1, int c1, int[][] b, int r2, int c2){
        if(r1!=r2||c1!=c2){
            System.out.println("Wrong input");
            return;
        }

        int[][] sum = new int[r1][c1];
        for(int i = 0; i < r1; i++){
            for(int j = 0; j < c1; j++){
                sum[i][j] = a[i][j] + b[i][j];
            }
        }
        printArray(sum);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first Matrix:");
        int r1, c1;
        System.out.println("enter the number of rows:");
        r1 = sc.nextInt();
        System.out.println("enter the number of cols:");
        c1 = sc.nextInt();
        int[][] a = new int[r1][c1];
        System.out.println("Enter the array element:");
        for(int i = 0; i < r1; i++){
            for(int j = 0; j < c1; j++){
               a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter Second Matrix:");
        int r2, c2;
        System.out.println("enter the number of rows:");
        r2 = sc.nextInt();
        System.out.println("enter the number of cols:");
        c2 = sc.nextInt();
        int[][] b = new int[r2][c2];
        System.out.println("Enter the array element:");
        for(int i = 0; i < r2; i++){
            for(int j = 0; j < c2; j++){
               b[i][j] = sc.nextInt();
            }
        }
        System.out.println("first matrics:");
        printArray(a);
        System.out.println("Second matrics:");
        printArray(b);
        System.out.println("Addition:");
        add(a, r1, c1, b, r2, c2);
    }
}

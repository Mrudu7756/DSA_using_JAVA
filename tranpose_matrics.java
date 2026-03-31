import java.util.Scanner;

public class tranpose_matrics {
    static void printArray(int[][] a){
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[i].length; j++){
                System.out.print(a[i][j] +" ");
            }
            System.out.println();
        }
    }
    static int[][] transpose(int[][] a, int r, int c){
        int[][] ans = new int[c][r];
        for(int i = 0 ; i < c; i++){
            for(int j = 0; j < r; j++){
                ans[i][j] = a[j][i];
            }
        }
        return ans;
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

        System.out.println("Transpose Matrices:");
        int[][] ans = transpose(a, r, c);
        printArray(ans);
    }
}

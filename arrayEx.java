import java.util.Scanner;

public class arrayEx {
    static boolean isSorted(int[] arr)
    {
        boolean check = true;
        for(int i = 1; i < arr.length;i++)
        {
            if(arr[i] < arr[i-1])
            {
                check = false;
                break;
            }
        } 
        return check;
    }

    static int StrictGreater(int[] arr, int x)
    {
        int count = 0;
        for(int i = 0; i < arr.length;i++)
        {
            if(arr[i]>x)
            {
                count++;
            }
        } 
        return count;
    }

    static int lastOccurance(int[] arr, int x)
    {
        int lastIndex = -1;
        for(int i = 0; i < arr.length;i++)
        {
            if(arr[i]== x)
            {
                lastIndex = i;
            }
        }
        return lastIndex;
    }

    static int countOccurence(int[] arr, int x)
    {
       int count = 0;
       for(int i = 0; i < arr.length;i++)
        {
            if(arr[i]==x)
            {
                count++;
            }
        } 
        return count;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter "+n+" elements");
        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter x: ");
        int x = sc.nextInt();
        System.out.println("Count of x = " + countOccurence(arr, x));
        System.out.println("last index of "+x+ " is " + lastOccurance(arr, x));
        System.out.println("element of greater than" +x+ " is " +StrictGreater(arr, x));
        System.out.println("is sorted" + isSorted(arr));



    }
    
}

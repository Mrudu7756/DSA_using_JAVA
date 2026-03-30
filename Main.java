class ArraysExample {
    void demoArrays()
    {
        int[] ages = {23,56,34,73,11};
        //using for loop
        for(int i = 0; i < ages.length; i++)
        {
            System.out.println(ages[i]);
        }
        //using for each
        for(int age : ages){
            System.out.println(age);
        }
        //using while loop 
        int i = 0;
        while(i < ages.length)
        {
            System.out.println(ages[i]);
            i++;
        }
        //calculate the sum of array element
        int sum = 0;
        for(i = 0; i < ages.length; i++)
        {
            sum+=ages[i];
        }
        System.out.println("Sum:"+sum);
        //find maximum element
        int ans = 0;
        for(i = 0; i < ages.length; i++)
        {
            if(ans < ages[i])
            {
                ans = ages[i];
            }
        }
        System.out.println("Max:"+ans);
        // search the given element
        int search = -1;
        int x = 73;
        for(i = 0; i < ages.length; i++)
        {
            if(ages[i]==x)
            {
                search=i;
            }
        }
        if(search==-1)
        {
            System.out.println("not found");
        }
        else{
            System.out.println("found " +x+ " at index " +search);
        }
    }
        void twoDaArray()
        {
        int matrix[][] = {{3,5,6},{6,4,1}};
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println(matrix.length);
    }

}
public class Main{
    public static void main(String args[])
    {
        ArraysExample obj = new ArraysExample();
        obj.demoArrays();
        obj.twoDaArray();
    }
}
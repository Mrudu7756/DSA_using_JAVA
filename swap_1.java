public class swap_1 {
    static void swap(int a, int b){
        System.out.println("Orginla value before swapping:");
        System.out.println("a:" +a);
        System.out.println("b:" +b);

        int temp;
        temp = a;
        a = b;
        b = temp;
        System.out.println("Values after swapping:");
        System.out.println("a:"+a);
        System.out.println("b:"+b);
    }
        public static void main(String args[]){
            int a = 10;
            int b = 6;
            swap(a, b);
        }
}

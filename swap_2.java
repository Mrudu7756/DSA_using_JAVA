public class swap_2 {

    static void swapWithoutTemp(int a, int b){
        System.out.println("Orginla value before swapping:");
        System.out.println("a:" +a);
        System.out.println("b:" +b);
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("Values after swapping:");
        System.out.println("a:"+a);
        System.out.println("b:"+b);
    }
        public static void main(String args[]){
            int a = 10;
            int b = 6;
            swapWithoutTemp(a, b);
        }
}

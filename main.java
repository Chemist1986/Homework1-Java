import java.util.Random;
public class main {
    public static void main(String[] args) {
        int i = getRandom();
        //int i = 16;
        System.out.println(i);
        int n = olderBit(i);
        System.out.println(n);
        int[] m1 = findMultiples(n, i);
        System.out.println("m1:");
        printArray(m1);
        System.out.println();
        int[] m2 = findNoMultiples(n, i);
        System.out.println("m2:");
        printArray(m2);


    }
    // 1
    static int getRandom(){
        int i = new Random().nextInt(-1000, 1000);
        return i;
    }
    //2
    static int olderBit(int i){
        int n = Integer.highestOneBit(i);
        return n;
    }
    //3
        static int[] findMultiples(int n, int i){
            int temp = (Short.MAX_VALUE / n - i / n);
            int[] m1 = new int[temp];
            int k = 0;
            for (int j = i; j <= Short.MAX_VALUE; j++ ){
                if (j % n == 0){
                    m1[k]= j;
                    k++;
                }
            }
            return m1;
        }
        static void printArray(int []arr){
            for (int l = 0; l < arr.length; l++) {
                System.out.printf("%d ", arr[l]);
            }
        }

        static int[] findNoMultiples(int n, int i) {
            int temp = (Short.MAX_VALUE  - i);
            int[] m2 = new int[temp];
            int k = 0;
            for (int j = Short.MAX_VALUE; j >= i; j--) {
                if (j % n != 0) {
                    m2[k] = j;
                    k++;
                }
            }
            return m2;
        }
}
package practice;

import java.util.Arrays;

public class FibonacciSequence {
    public static void main(String[] args) {
        int[] fibonacci = findFibonacci(10);

        System.out.println(Arrays.toString(fibonacci));

        for (int f : fibonacci){
            System.out.println(f);
        }
    }

    public static int[] findFibonacci(int count){
        int n1=0,n2=1,n3;
        int[] fibonacci = new int[count];
        fibonacci[0] = n1;
        fibonacci[1] = n2;

        for (int i = 2; i<count;++i){
            n3 = n1 + n2;
            fibonacci[i] = n3;
            n1 = n2;
            n2 = n3;
        }
        return fibonacci;
    }
}

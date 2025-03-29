package practice;

import java.util.Arrays;

public class Annagram {
    public static void main(String[] args) {
        checkIfItIsAnnagram("race","care");
    }

    public static void checkIfItIsAnnagram(String a, String b){
        char[] arrayA = a.toCharArray();
        char[] arrayB = b.toCharArray();

        Arrays.sort(arrayA);
        Arrays.sort(arrayB);


        System.out.println(Arrays.equals(arrayA, arrayB));
    }
}

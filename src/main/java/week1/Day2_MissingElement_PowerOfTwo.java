package week1;

public class Day2_MissingElement_PowerOfTwo {
    public static int findMissingElement(int[] x, int n){
        //Given Integer array x[], return missing number in 1 to n.
        int total = n*(n+1)/2;
        int sum = 0;
        for(int i = 0; i<x.length; i++){
            sum = sum+x[i];
        }
        return total-sum;
    }

    public static boolean powerOfTwo(int x){
        //Given an integer x, return true if it is a power of two.Otherwise, return false
        if(x==0){
            return false;
        }
        while(x%2==0){
            x=x/2;
        }
        if (x==1){
            return true;
        }else{
            return false;
        }
    }


    public static void main(String[] args) {
        int[] numberArray = {5,3,1,4,6,2,8,7};
        int n = 9;
        System.out.println(findMissingElement(numberArray, n));
        System.out.println(powerOfTwo(16));
    }
}

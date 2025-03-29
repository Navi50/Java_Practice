package practice;

public class Test {
    public static void main(String[] args) {
        int first = 0 ;
        int second = 1 ;
        System.out.println(first);
        for(int i=7;i>=0;i--){
            System.out.println(second);
            second = first+second;
            first = second-first;
        }

    }
}

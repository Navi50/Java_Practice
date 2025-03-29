package practice;

import java.util.ArrayList;
import java.util.List;

public class Pyramid {
    public static void main(String[] args) {
        starPyramid(5);
        numberPyramid(5);
    }

    public static void starPyramid(int count){
        for(int i=1;i<=count;i++){
            for (int j=1; j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void numberPyramid(int count){
        List<Integer> list = new ArrayList<>();
        for (int i=1;i<=count;i++){
            list.add(i);
            System.out.println(list);
        }
    }

}

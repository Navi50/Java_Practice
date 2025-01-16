package java_Concepts.Loops;

public class Loops {
    public static void main(String[] args){
        System.out.println(tryForLoop(4));
        System.out.println(tryWhileLoop(5));
        System.out.println(tryDoWhileLoop(5));
    }



    public static int tryForLoop(int a){
        int x = 0;
        for (int i = a;i>0;i--){
            x = x+i;
        }
        return x;
    }

    public static int tryWhileLoop(int a){
        int x = 0;
        while (a>0){
            x = x+a;
            a--;
        }
        return x;
    }

    public static int tryDoWhileLoop(int a){
        int x = 0;
        do {
            x = x+a;
            a--;
        }while (a>0);
        return x;
    }
}

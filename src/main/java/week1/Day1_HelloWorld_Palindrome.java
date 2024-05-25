package week1;

public class Day1_HelloWorld_Palindrome {

// Given an integer x, return true if x is a Palindrome, and false if otherwise.

    public static boolean isPalindrome(int x){

        if(x<0){
            return false;
        }

        int a = x;
        int revnum = 0;
        while(a>0){
            int digit = a%10;
            revnum = revnum*10+digit;
            a = a/10;
            System.out.println(revnum);
        }
        if(revnum==x){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args){
        String hello = "Hello World";
        System.out.println(hello);
        System.out.println(isPalindrome(12344321));
    }


}

package practice;

public class GreatestCommonDivisorOfStrings {
    public static String solution(String str1, String str2) {
        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }
        int gcdlen = gcd(str1.length(),str2.length());

        return str1.substring(0,gcdlen);
    }

    public static int gcd(int s1, int s2){
        while(s2 != 0){
            int temp = s2;
            s2 = s1 % s2;
            s1 = temp;
        }
        return s1;
    }

    public static void main(String[] args) {

        // Example 1:
        String str1 = "LEET";
        String str2 = "CODE";
        System.out.println(solution(str1, str2)); // Output: "ABC"


    }
}

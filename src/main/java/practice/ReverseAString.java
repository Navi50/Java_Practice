package practice;

public class ReverseAString {
    public static void main(String[] args) {

        System.out.println(reverseUsingBuffer("Naveen"));
        System.out.println(reverseUsingBuilder("Kumar"));
        System.out.println(reverseString("Christy"));

    }

    public static String reverseUsingBuffer(String text){
        StringBuffer buffer = new StringBuffer();
        buffer.append(text);
        buffer.reverse();

        return buffer.toString();
    }

    public static String reverseUsingBuilder(String text){
        StringBuilder builder = new StringBuilder();
        builder.append(text);
        builder.reverse();

        return builder.toString();
    }

    public static String reverseString(String text){
        String reverse = "";
        char[] charArray = text.toCharArray();
        int count = charArray.length;
        for(int i=count-1;i>=0;i--){
            reverse = reverse+charArray[i];
        }
        return reverse;

    }

}

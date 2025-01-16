package java_Concepts.ControlStatements;

public class ControlStatementsIfElseSwitch {
    public static void main(String[] args) {
        System.out.println(tryif(10,88));
        System.out.println(tryIfElse(90,19));
        System.out.println(tryIfElseLadder(12,23,123));
        System.out.println(tryNestedIf(90,21,92));
        System.out.println(trySwitch(9));
    }

    public static String tryif(int a, int b){
        if(a>b){
            return "Number A "+a+" is greater than B";
        }
        return "B is Greater";
    }

    public static String tryIfElse(int a, int b){
        if(a>b){
            return "Number A "+a+" is greater than B";
        }else{
            return "Number B "+b+" is greater than A";
        }
    }

    public static String tryIfElseLadder(int a, int b, int c){
        if(a>b && a>c){
            return "Number A "+a+" is greater than B and C";
        } else if (b>a && b>c) {
            return "Number B "+b+" is greater than A and C";
        }else{
            return "Number C "+c+" is greater than B and A";
        }
    }

    public static String tryNestedIf(int a, int b, int c){
        if (a>b){
            if (a>c){
                return "Number A "+a+" is greater than B and C";
            } else if (c>b) {
                return "Number C "+c+" is greater than B and A";
            }
        } else {
            return "Number B "+b+" is greater than A and C";
        }
        return "";
    }

    public static String trySwitch(int a){
        switch (a){
            case 1:
                return "1st Day of the week is Monday";
            case 2:
                return "2nd Day of the week is Tuesday";
            case 3:
                return "3rd Day of the week is Wednesday";
            case 4:
                return "4th Day of the week is Thursday";
            case 5:
                return "5th Day of the week is Friday";
            case 6:
                return "6th Day of the week is Saturday";
            case 7:
                return "7th Day of the week is Sunday";
            default:
                return "Invalid Day";
        }
    }
}

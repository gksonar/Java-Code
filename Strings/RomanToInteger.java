package Strings;

public class RomanToInteger {
    static int RomanToInt(String str) {
        int value = 0;
        int previous = 0;
        int result = 0;

        for (int i = str.length() - 1; i >= 0; i--) {
            switch (str.charAt(i)) {
                case 'I':
                    value = 1;
                    break;
                case 'V':
                    value = 5;
                    break;
                case 'X':
                    value = 10;
                    break;
                case 'L':
                    value = 50;
                    break;
                case 'C':
                    value = 100;
                    break;
                case 'D':
                    value = 500;
                    break;
                case 'M':
                    value = 1000;
                    break;
            }

            if (previous == 0) {
                result = result + value;
                previous = value;
            } else if (previous > result) {
                result = result - value;
                previous = value;
            } else {
                result = result + value;
                previous = value;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String Str = "LVIII";
        int a = RomanToInt(Str);
        System.out.println(a);
    }
}

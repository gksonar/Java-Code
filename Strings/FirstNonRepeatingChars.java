package Strings;

public class FirstNonRepeatingChars {

    static final int NO_OF_CHARS = 256;
    static char count[] = new char[NO_OF_CHARS];

    static void getRepeated(String str) {
        for (int i = 0; i < str.length(); i++)
            count[str.charAt(i)]++;
        // System.out.println(Arrays.toString(count));
    }

    static int FirstNonRepeatingChar(String str) {
        getRepeated(str);
        int index = -1, i;
        for (i = 0; i < str.length(); i++) {
            if (count[str.charAt(i)] == 1) {
                index = i;
                break;
            }

        }
        return index;

    }

    public static void main(String[] args) {
        String str = "GauravurG";
        int a = FirstNonRepeatingChar(str);
        if (a == -1) {
            System.out.println("not found");
        } else {
            System.out.println(str.charAt(a));
        }

        // System.out.println("F-N-C");
    }

}

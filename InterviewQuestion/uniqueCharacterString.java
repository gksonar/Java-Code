package InterviewQuestion;

public class uniqueCharacterString {
    public static void main(String[] args) {
        String str = "GauravSOnar";
        char a[] = new char[str.length()];
        a = str.toCharArray();
        for (int i = 0; i < a.length; i++) {
            if (str.indexOf(a[i]) == str.lastIndexOf(a[i])) {
                System.out.println(a[i]);
                break;
            }
        }
    }
}

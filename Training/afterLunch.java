package Training;

public class afterLunch {
    public static void func(int num1, int num2) {
        int carry = 0;
        int count = 0;
        while (num1 != 0 && num2 != 0) {
            int temp = num1 % 10;
            int temp1 = num1 % 10;
            if ((temp + temp1 + carry) > 9) {
                count++;
                carry = 1;
            } else {
                carry = 0;
            }
            temp = temp / 10;
            temp1 = temp1 / 10;
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        func(999, 999);
        System.out.println("Hello");

    }
}

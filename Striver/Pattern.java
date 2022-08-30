// https://takeuforward.org/strivers-a2z-dsa-course/must-do-pattern-problems-before-starting-dsa/
package Striver;

public class Pattern {
    public static void main(String[] args) {
        pattern1(5);
        pattern2(5);
        pattern3(5);
        pattern4(5);
        pattern5(5);
        pattern6(5);

        pattern7(5);
        pattern8(5);
        pattern9(5);
        pattern10(5);
        pattern11(5);
        pattern12(5);
        pattern13(5);
        pattern14(5);
        pattern15(5);
        pattern16(5);
        pattern17(5);
        pattern18(5);
        pattern19(5);
        pattern20(5);
        pattern21(4);
        pattern22(5); // EQ Question

    }

    public static void pattern1(int no) {
        System.out.println("pattern-1");
        for (int i = 0; i < no; i++) {
            for (int j = 0; j < no; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern2(int no) {
        System.out.println("pattern-2");
        for (int i = 0; i < no; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern3(int no) {
        System.out.println("pattern3");
        for (int i = 0; i < no; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print(j + 1);
            }
            System.out.println();
        }
    }

    public static void pattern4(int no) {
        System.out.println("pattern4");
        for (int i = 0; i < no; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print(i + 1);
            }
            System.out.println();
        }
    }

    public static void pattern5(int no) {
        System.out.println("pattern5");
        for (int i = 0; i < no; i++) {
            for (int j = 0; j < (no - i); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern6(int no) {
        System.out.println("pattern6");
        for (int i = 0; i < no; i++) {
            for (int j = 0; j < (no - i); j++) {
                System.out.print(j + 1);
            }
            System.out.println();
        }
    }

    public static void pattern7(int no) {
        System.out.println("pattern7");
        for (int i = 0; i < no; i++) {
            for (int j = 1; j < (no - i); j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < (i * 2) + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern8(int no) {
        System.out.println("pattern7");
        for (int i = no - 1; i >= 0; i--) {
            for (int j = 1; j < no - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < (i * 2) + 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public static void pattern9(int no) {

        System.out.println("pattern9");
        for (int i = 0; i < no; i++) {
            for (int j = 1; j < (no - i); j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < (i * 2) + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = no - 1; i >= 0; i--) {
            for (int j = 1; j < no - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < (i * 2) + 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public static void pattern10(int no) {
        int p = 0;
        System.out.println("pattern10");
        for (int i = 1; i <= no; i++) {
            if (i % 2 == 0) {
                p = 0;
            } else {
                p = 1;
            }
            for (int j = 0; j < i; j++) {
                System.out.print(p);
                p = (p == 0) ? 1 : 0;
            }
            System.out.println();
        }
    }

    public static void pattern11(int no) {
        System.out.println("pattern11");
        for (int i = 1; i <= no; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for (int j = 1; j < (no * 2) - (i * 2); j++) {
                System.out.print(" ");
            }

            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void pattern12(int no) {
        System.out.println("pattern12");
        int a = 1;

        for (int i = 1; i <= no; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(a++ + " ");
            }
            System.out.println();
        }
    }

    public static void pattern13(int no) {
        System.out.println("pattern13");
        char a = 'A';
        for (int i = 1; i <= no; i++) {
            a = 'A';
            for (int j = 1; j <= i; j++) {
                System.out.print(a++ + " ");
            }
            System.out.println();
        }
    }

    public static void pattern14(int no) {
        System.out.println("pattern14");
        char a = 'A';
        for (int i = no; i >= 1; i--) {
            a = 'A';
            for (int j = 1; j <= i; j++) {
                System.out.print(a++ + " ");
            }
            System.out.println();
        }
    }

    public static void pattern15(int no) {
        System.out.println("pattern15");
        char a = 'A';
        for (int i = 1; i <= no; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(a + " ");
            }
            a++;
            System.out.println();
        }
    }

    public static void pattern16(int no) {
        System.out.println("pattern16");
        char a = 'A';
        for (int i = 1; i <= no; i++) {
            a = 'A';
            for (int j = 1; j <= no - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i * 2 - 1; j++) {
                if (j < i) {
                    System.out.print(a++);
                } else {
                    System.out.print(a--);
                }
            }
            System.out.println();
        }
    }

    public static void pattern17(int no) {
        System.out.println("pattern17");
        int a = 'E';
        for (int i = 0; i < no; i++) {
            a = 'E';
            a = a - i;
            for (int j = 1; j <= (i + 1); j++) {
                System.out.print((char) a++);
            }

            System.out.println();
        }
    }

    public static void pattern18(int no) {
        System.out.println("pattern18");
        for (int i = 0; i < no; i++) {
            for (int j = 1; j < no - i; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < i * 2; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j < no - i; j++) {
                System.out.print("*");
            }
            if (i == no - 1 || i == no - 2) {
                break;
            }
            System.out.println();

        }

        for (int i = no; i > 0; i--) {
            for (int j = 0; j < no - i; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < (i - 1) * 2; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < no - i; j++) {
                System.out.print("*");
            }

            System.out.println();

        }

    }

    public static void pattern19(int no) {
        System.out.println("pattern19");

        for (int i = no; i > 0; i--) {
            for (int j = 0; j < no - i; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < (i - 1) * 2; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < no - i; j++) {
                System.out.print("*");
            }

            System.out.println();

        }
        for (int i = 0; i < no; i++) {
            for (int j = 1; j < no - i; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < i * 2; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j < no - i; j++) {
                System.out.print("*");
            }
            if (i == no - 1 || i == no - 2) {
                break;
            }
            System.out.println();

        }

    }

    public static void pattern20(int no) {
        System.out.println();
        System.out.println("Pattern 20");
        for (int i = 0; i < no; i++) {
            if (i == 0 || i == no - 1) {
                for (int j = 0; j < no - 1; j++) {
                    System.out.print("*");
                }
            } else {
                for (int j = 0; j < 1; j++) {
                    System.out.print("*");
                }
                for (int j = 0; j < (no - 1) / 2; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < 1; j++) {
                    System.out.print("*");
                }
            }

            System.out.println();
        }

    }

    public static void pattern21(int no) {
        System.out.println();
        System.out.println("Pattern 20");
        for (int i = 0; i < (no * 2) - 1; i++) {
            if (i == 0 || i == (no * 2) - 2) {
                for (int j = 0; j < (no * 2) - 1; j++)
                    System.out.print(no);
            } else {
                for (int j = 0; j < (no * 2) - 1; j++)
                    System.out.print(i);

            }
            System.out.println();
        }

    }

    public static void pattern22(int no) {
        int count = 1;
        System.out.println("Pattern 22 ");
        for (int i = 1; i <= no; i++) {
            count = 1;
            for (int j = 1; j <= (i * 2) - 1; j++) {
                if (j % 2 == 0) {
                    System.out.print("*");
                } else {
                    System.out.print(count++);
                }
            }
            System.out.println();
        }
    }
}

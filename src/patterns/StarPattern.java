package patterns;

public class StarPattern {
    public static void main(String[] args) {
        // pattern1(4);
        // pattern2(5);
        // pattern3(5);
//        pattern4(5);
//        pattern5(3);
//        pattern6(5);
//        pattern7(4);
//        pattern8(5);
//        pattern9(5);
//        pattern10(5);
//        pattern11(5);
//        pattern12(3);
//        pattern13(5);
//        pattern14(5);
//        pattern15(5);
//        pattern16(5);
//        pattern17(4);
//        pattern18(3);
//        pattern18_1(3);
//        pattern19(3);
//        pattern20(5);
//        pattern21(3);
        pattern22(4);

    }

    private static void pattern22(int n) {
        for (int i = 0; i < 2 * n - 1; i++) {
            for (int j = 0; j < 2 * n - 1; j++) {
                int top = i;
                int left = j;
                int right = (2 * n - 2) - j;
                int bottom = (2 * n - 2) - i;
                System.out.print(n - Math.min(Math.min(top, bottom), Math.min(left, right)));
            }
            System.out.println();
        }
    }

    private static void pattern21(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0 || i == n - 1 || j == n - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    private static void pattern20(int n) {
        int spaces = 2 * n;
        //stars
        for (int i = 0; i < 2 * n - 1; i++) {
            int stars;
            if (i < n) {
                stars = i + 1;
                spaces -= 2;
            } else {
                stars = 2 * n - (i + 1);
                spaces += 2;
            }

            for (int j = 0; j < stars; j++) {
                System.out.print("*");
            }

            //spaces
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }

            //stars
            for (int j = 0; j < stars; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    private static void pattern19(int n) {
        //First half
        int in_space = 0;
        for (int i = 0; i < n; i++) {
            //stars
            for (int j = 0; j < n - i; j++) {
                System.out.print("*");
            }
            //space
            for (int j = 0; j < in_space; j++) {
                System.out.print(" ");
            }
            //stars
            for (int j = 0; j < n - i; j++) {
                System.out.print("*");
            }
            System.out.println();
            in_space += 2;
        }
        //Second half
        in_space = 2 * n - 2;
        for (int i = 0; i < n; i++) {
            //stars
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            //space
            for (int j = 0; j < in_space; j++) {
                System.out.print(" ");
            }
            //stars
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
            in_space -= 2;
        }
    }

    private static void pattern18_1(int n) {
        char c;
        for (int i = 0; i < n; i++) {
            c = (char) (64 + n);
            for (int j = 0; j <= i; j++) {
                System.out.print(c + " ");
                c--;
            }
            System.out.println();
        }
    }

    private static void pattern18(int n) {
        char c;
        for (int i = 0; i < n; i++) {
            c = (char) (64 + (n - i));
            for (int j = 0; j <= i; j++) {
                System.out.print(c + " ");
                c++;
            }
            System.out.println();
        }
    }

    private static void pattern17(int n) {
        int end = 0;
        char c;
        for (int i = 0; i < n; i++) {
            c = 64;
            end = (i == 0) ? n : end + 1;
            for (int j = 0; j < end; j++) {
                if (j < n - (i + 1)) {
                    System.out.print(" ");
                } else {
                    if (j >= n) {
                        c--;
                        System.out.print(c);
                    } else {
                        c++;
                        System.out.print(c);
                    }

                }
            }
            System.out.println();
        }
    }

    private static void pattern16(int n) {
        char k = 65;
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(k + " ");

            }
            k += 1;
            System.out.println();
        }
    }

    private static void pattern15(int n) {
        for (int i = 1; i <= n; i++) {
            char k = 65;
            for (int j = n; j >= i; j--) {
                System.out.print(k + " ");
                k++;
            }
            System.out.println();
        }
    }

    private static void pattern14(int n) {

        for (int i = 1; i <= n; i++) {
            char k = 65;
            for (int j = 1; j <= i; j++) {
                System.out.print(k);
                k++;
            }
            System.out.println();
        }
    }

    private static void pattern13(int n) {
        int k = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(k + " ");
                k++;
            }
            System.out.println();
        }
    }

    static void pattern1(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern2(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern3(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(j + 1);
            }
            System.out.println();
        }
    }

    static void pattern4(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    static void pattern5(int n) {
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern6(int n) {
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(j + 1 + " ");
            }
            System.out.println();
        }
    }

    static void pattern7(int n) {
        int end = 0;
        for (int i = 0; i < n; i++) {
            end = (i == 0) ? n : end + 1;
            for (int j = 0; j < end; j++) {
                if (j < n - (i + 1)) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    private static void pattern8(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < (2 * n - (2 * i + 1)); j++) {
                System.out.print("*");
            }

            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    private static void pattern9(int n) {
        pattern7(n);
        pattern8(n);
    }

    private static void pattern10(int n) {
        for (int i = 1; i <= 2 * n - 1; i++) {
            int stars = (i < n) ? i : 2 * n - i;
            for (int j = 0; j < stars; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void pattern11(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                String str = ((i + j) % 2 == 0) ? "1" : "0";
                System.out.print(str);
            }
            System.out.println();
        }
    }

    private static void pattern12(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2 * n; j++) {
                String str;
                if (j < i + 1) {
                    str = String.valueOf(j + 1);
                } else if (j >= (2 * n - (i + 1))) {
                    str = String.valueOf(2 * n - j);
                } else {
                    str = " ";
                }
                System.out.print(str);
            }
            System.out.println();
        }
    }


}
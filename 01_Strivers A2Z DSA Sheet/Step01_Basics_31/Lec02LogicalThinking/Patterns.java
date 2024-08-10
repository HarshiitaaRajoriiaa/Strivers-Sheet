package Lec02LogicalThinking;

class Patterns {
    public static void main(String[] args) {
    }

    // ?01
    // https://www.naukri.com/code360/problems/n-forest_6570177?leftPanelTabValue=SUBMISSION
    public static void nForest1(int n) {
        // Write your code here
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }

    // ?02
    // https://www.naukri.com/code360/problems/n-2-forest_6570178?leftPanelTabValue=SUBMISSION
    public static void nForest2(int n) {
        // Write your code here
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }

    // ?03
    // https://www.naukri.com/code360/problems/n-triangles_6573689?leftPanelTabValue=SUBMISSION
    public static void nTriangle1(int n) {
        // Write your code here
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(j + 1);
            }
            System.out.println(" ");
        }
    }

    // ?04 https://www.naukri.com/code360/problems/triangle_6573690
    public static void nTriangle2(int n) {
        // Write your code here
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(i + 1);
            }
            System.out.println(" ");
        }
    }

    // ?05 https://www.naukri.com/code360/problems/seeding_6581892
    public static void seeding(int n) {
        // Write your code here
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= n - 1 - i; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }

    // ?06
    // https://www.naukri.com/code360/problems/reverse-number-triangle_6581889?leftPanelTabValue=SUBMISSION
    public static void nNumberTriangle(int n) {
        // Write your code here
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= n - i - 1; j++) {
                System.out.print(j + 1);
            }
            System.out.println(" ");
        }

    }
    // ?07 https://www.naukri.com/code360/problems/star-triangle_6573671

    public static void starPyramid(int n) {
        for (int i = 0; i < n; i++) {
            // Spaces:
            for (int j = 0; j < n - 1 - i; j++) {
                System.out.print(" ");
            }
            // Stars:
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            // Spaces:
            for (int j = 0; j < n - 1 - i; j++) {
                System.out.print(" ");
            }
            System.out.println(" ");
        }
    }

    // ?08 https://www.naukri.com/code360/problems/reverse-star-triangle_6573685
    public static void starPyramid2(int n) {
        for (int i = 0; i < n; i++) {
            // Spaces:
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            // Stars:
            for (int j = 0; j < 2 * n - (1 + 2 * i); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // ?09 https://www.naukri.com/code360/problems/star-diamond_6573686
    public static void starPyramid3(int n) {
        starPyramid(n);
        starPyramid2(n);
    }

    // ?10 https://www.naukri.com/code360/problems/rotated-triangle_6573688
    public static void nStarTriangle(int n) {
        // Write your code here
        nForest2(n);
        seeding(n - 1);
    }

    // ?11 https://www.naukri.com/code360/problems/binary-number-triangle_6581890
    public static void nBinaryTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print(1 + " ");
                } else {
                    System.out.print(0 + " ");
                }
            }
            System.out.println("");
        }
    }

    // ?12 https://www.naukri.com/code360/problems/number-crown_6581894
    public static void numberCrown(int n) {
        int spaces = 2 * (n - 1);
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            for (int j = 1; j <= spaces; j++) {
                System.out.print("  ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
            spaces -= 2;
        }
    }

    // ?13
    // https://www.naukri.com/code360/problems/increasing-number-triangle_6581893
    public static void nNumberTriangle2(int n) {
        int counter = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(counter + " ");
                counter++;
            }
            System.out.println("");
        }
    }

    // ? 14
    // https://www.naukri.com/code360/problems/increasing-letter-triangle_6581897
    public static void nLetterTriangle1(int n) {
        // Write your code here
        for (int i = 0; i < n; i++) {
            for (char j = 'A'; j <= 'A' + i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    // ? 15 https://www.naukri.com/code360/problems/reverse-letter-triangle_6581906
    public static void nLetterTriangle2(int n) {
        for (int i = 1; i <= n; i++) {
            for (char j = 'A'; j <= 'A' + (n - i); j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    // ? 16 https://www.naukri.com/code360/problems/alpha-ramp_6581888
    public static void alphaRamp(int n) {

        for (int i = 1; i <= n; i++) {
            char c = (char) ('A' + i - 1);
            for (int j = 1; j <= i; j++) {
                System.out.print(c + " ");
            }
            System.out.println("");
        }
    }

    // ? 17 https://www.naukri.com/code360/problems/alpha-hill_6581921
    public static void alphaHill(int n) {
        for (int i = 1; i <= n; i++) {
            // spaces:
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            char o = 'A';
            int mid = (2 * i) / 2;
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print(o + " ");
                if (j < mid) {
                    o++;
                } else {
                    o--;
                }
            }
            System.out.println();
        }
    }

    // ? 18
    // https://www.naukri.com/code360/problems/symmetric-void_6581919?leftPanelTabValue=SUBMISSION
    public static void symmetry(int N) {
        // for the upper half of the pattern.
        // initial spaces.
        int iniS = 0;
        for (int i = 0; i < N; i++) {
            // for printing the stars in the row.
            for (int j = 1; j <= N - i; j++) {
                System.out.print("*" + " ");
            }
            // for printing the spaces in the row.
            for (int j = 0; j < iniS; j++) {
                System.out.print(" ");
            }
            // for printing the stars in the row.
            for (int j = 1; j <= N - i; j++) {
                System.out.print("*" + " ");
            }
            // The spaces increase by 2 every time we hit a new row.
            iniS += 2;
            // As soon as the letters for each iteration are printed, we move to the
            // next row and give a line break otherwise all letters
            // would get printed in 1 line.
            System.out.println();
        }
        // for lower half of the pattern
        // initial spaces.
        iniS = 2 * N - 2;
        for (int i = 1; i <= N; i++) {
            // for printing the stars in the row.
            for (int j = 1; j <= i; j++) {
                System.out.print("*" + " ");
            }
            // for printing the spaces in the row.
            for (int j = 0; j < iniS; j++) {
                System.out.print(" ");
            }
            // for printing the stars in the row.
            for (int j = 1; j <= i; j++) {
                System.out.print("*" + " ");
            }
            // The spaces decrease by 2 every time we hit a new row.
            iniS -= 2;
            // As soon as the letters for each iteration are printed, we move to the
            // next row and give a line break otherwise all letters
            // would get printed in 1 line.
            System.out.println();
        }
    }

}



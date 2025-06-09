public class Patterns {
    public static void main(String[] args) {
        //Print the Pattern Solid Rectangle
       /* int n = 4;
        int m = 5;
        //outer loop
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}*/
// Print the pattern  Hollow rectangle
       /* int n = 4;
        int m = 5;
//outer loop
        for (int i = 1; i <= n; i++) {
            // inner loop
            for (int j = 1; j <= m; j++) {
                if (i == 1 || j == 1 || i == n || j == m) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(); // move to the next line after printing one row
        }
    }
}*/
//Print the pattern Half Pyramid
        /*int n = 4;
//outer loop
        for (int i = 1; i <= n; i++) {
            //inner loop
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}*/
//Print the pattern Inverted half pyramid
       /* int n = 4;
//outer loop
        for (int i = n; i <= n; i--) {
            //inner loop for print space
            for (int j = 1; j <= n-i; j++) {
                System.out.println(" ");
            }
            //inner loop for print star
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}*/
//inverted half pyramid  with numbers
       /*/ int n = 5;
//outer loop
        for (int i = 1; i <= n; i++) {
            //inner loop
            for (int j = 1; j <= n-i+1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}*/
//Print the pattern Floyd's  pattern
       /* int n = 5;
        int number = 1;
//outer loop
        for (int i = 1; i <= n; i++) {
            //inner loop
            for (int j = 1; j <= i; j++) {
                System.out.print(number+" ");
                number++; //number =number+1
            }
            System.out.println();
        }
    }
}*/
//Print hte pattern of 0-1 Triangle
        int n = 5;
//outer loop
        for (int i = 1; i <= n; i++) {
//inner loop
            for (int j = 1; j <= i; j++) {
                int sum = i + j;
                if (sum % 2 == 0) {
                    System.out.print("1 ");
                } else {//odd
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}










import java.util.Scanner;
public class Rubik27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rubik[][] = {{1, 2, 3, 10, 11, 12, 19, 20, 21},
                        {4, 5, 6, 13, 14, 15, 22, 23, 24},
                        {7, 8, 9, 16, 17, 18, 25, 26, 27}};

        int time = sc.nextInt();
        for (int i = 0; i < time; i++) {
            String rot = sc.next();
            int index = sc.nextInt();
            switch (rot) {
                case "up" :
                    rubik = up(rubik, index);
                    //up(rubik, index);
                    break ;
                case "down" :
                    rubik = down(rubik, index);
                    //down(rubik, index);
                    break ;
                case "right" :
                    rubik = right(rubik, index);
                    //right(rubik, index);
                    break ;
                case "left" :
                    rubik = left(rubik, index);
                    //left(rubik, index);
                    break ;
            }
        }

        sc.close();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(rubik[i][j]);
                if (!(i == 2 && j == 2))
                    System.out.print(" ");
            }
            System.out.print("\n");
        }
    }
    //clockwise = up and left
    private static int[][] up(int[][] arr, int pos) {
        int a[][] = new int[3][3];
        for (int i = 0; i < 3; i++) {
            int k = pos;
            for (int j = 0; j < 3; j++) {
                a[i][j] = arr[i][k];
                k += 3;
            }
        }
        // transpose
        for (int i = 0; i < 3; i++) {
            for (int j = i; j < 3; j++) {
                if (i != j) {
                    int temp = a[i][j];
                    a[i][j] = a[j][i];
                    a[j][i] = temp;
                }
            }
        }
        //swap
        for (int i = 0; i < 3; i++) {
            int temp = a[i][0];
            a[i][0] = a[i][2];
            a[i][2] = temp;
        }
        //put back
        for (int i = 0; i < 3; i++) {
            int k = pos;
            for (int j = 0; j < 3; j++) {
                arr[i][k] = a[i][j];
                k += 3;
            }
        }
        //print check
        // for (int i = 0; i < 3; i++) {
        //     int k = pos;
        //     for (int j = 0; j < 3; j++) {
        //         System.out.print(arr[i][k] + " ");
        //         k += 3;
        //     }
        //     System.out.print("\n");
        // }
        return (arr);
    }
    //anti clock wise anti clock wise
    private static int[][] down(int[][] arr, int pos) {
        int a[][] = new int[3][3];
        for (int i = 0; i < 3; i++) {
            int k = pos;
            for (int j = 0; j < 3; j++) {
                a[i][j] = arr[i][k];
                k += 3;
            }
        }
        //transpose
        for (int i = 0; i < 3; i++) {
            for (int j = i; j < 3; j++) {
                if (i != j) {
                    int temp = a[i][j];
                    a[i][j] = a[j][i];
                    a[j][i] = temp;
                }
            }
        }
        //print small
        // for (int i = 0; i < 3; i++) {
        //     for (int j = 0; j < 3; j++) {
        //         System.out.print(a[i][j] + " ");
        //     }
        //     System.out.print("\n");
        // }
        //swap
        for (int j = 0; j < 3; j++) {
            int temp = a[0][j];
            a[0][j] = a[2][j];
            a[2][j] = temp;
        }
        //put back
        for (int i = 0; i < 3; i++) {
            int k = pos;
            for (int j = 0; j < 3; j++) {
                arr[i][k] = a[i][j];
                k += 3;
            }
        }
        //print check
        // for (int i = 0; i < 3; i++) {
        //     int k = pos;
        //     for (int j = 0; j < 3; j++) {
        //         System.out.print(arr[i][k] + " ");
        //         k += 3;
        //     }
        //     System.out.print("\n");
        // }
        return (arr);
    }

    private static int[][] right(int[][] arr, int pos) {
        int a[][] = new int[3][3];
        int k = 0;
        int use = pos;
        for (int i = 2; i >= 0; i--) {
            for (int j = 0; j < 3; j++) {
                a[i][j] = arr[use][k];
                k++;
            }
        }
        //print small
        // for (int i = 0; i < 3; i++) {
        //     for (int j = 0; j < 3; j++) {
        //         System.out.print(a[i][j] + " ");
        //     }
        //     System.out.print("\n");
        // }
        //transpose
        for (int i = 0; i < 3; i++) {
            for (int j = i; j < 3; j++) {
                if (i != j) {
                    int temp = a[i][j];
                    a[i][j] = a[j][i];
                    a[j][i] = temp;
                }
            }
        }
        //print small
        // for (int i = 0; i < 3; i++) {
        //     for (int j = 0; j < 3; j++) {
        //         System.out.print(a[i][j] + " ");
        //     }
        //     System.out.print("\n");
        // }
        //swap
        for (int j = 0; j < 3; j++) {
            int temp = a[0][j];
            a[0][j] = a[2][j];
            a[2][j] = temp;
        }
        //print small
        // for (int i = 0; i < 3; i++) {
        //     for (int j = 0; j < 3; j++) {
        //         System.out.print(a[i][j] + " ");
        //     }
        //     System.out.print("\n");
        // }
        //put back
        for (int i = 0; i < 3; i++) {
            arr[use][i] = a[2][i];
        }
        int j = 0;
        for (int i = 3; i < 6; i++) {
            arr[use][i] = a[1][j];
            j++;
        }
        int p = 0;
        for (int i = 6; i < 9; i++) {
            arr[use][i] = a[0][p];
            p++;
        }
        //print check
        // for (int i = 0; i < 3; i++) {
        //     int z = pos;
        //     for (int j = 0; j < 3; j++) {
        //         System.out.print(arr[i][z] + " ");
        //         z += 3;
        //     }
        //     System.out.print("\n");
        // }
        return (arr);
    }

    private static int[][] left(int[][] arr, int pos) {
        int a[][] = new int[3][3];
        int k = 0;
        int use = pos;
        for (int i = 2; i >= 0; i--) {
            for (int j = 0; j < 3; j++) {
                a[i][j] = arr[use][k];
                k++;
            }
        }
        //print small
        // for (int i = 0; i < 3; i++) {
        //     for (int j = 0; j < 3; j++) {
        //         System.out.print(a[i][j] + " ");
        //     }
        //     System.out.print("\n");
        // }
        //transpose
        for (int i = 0; i < 3; i++) {
            for (int j = i; j < 3; j++) {
                if (i != j) {
                    int temp = a[i][j];
                    a[i][j] = a[j][i];
                    a[j][i] = temp;
                }
            }
        }
        //swap
        for (int i = 0; i < 3; i++) {
            int temp = a[i][0];
            a[i][0] = a[i][2];
            a[i][2] = temp;
        }
        //put back
        for (int i = 0; i < 3; i++) {
            arr[use][i] = a[2][i];
        }
        int j = 0;
        for (int i = 3; i < 6; i++) {
            arr[use][i] = a[1][j];
            j++;
        }
        int d = 0;
        for (int i = 6; i < 9; i++) {
            arr[use][i] = a[0][d];
            d++;
        }
        //print check
        // for (int i = 0; i < 3; i++) {
        //     int z = pos;
        //     for (int j = 0; j < 3; j++) {
        //         System.out.print(arr[i][z] + " ");
        //         z += 3;
        //     }
        //     System.out.print("\n");
        // }
        return (arr);
    }
}

package twodarray;

import java.util.*;

public class spiraldisplay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int minr = 0;
        int minc = 0;
        int maxr = arr.length - 1;
        int maxc = arr[0].length - 1;
        int tne = n * m;
        int cnt = 0;
        while (cnt < tne) {
            for (int i = minr, j = minc; i <= maxr && cnt<tne; i++) {
                System.out.println(arr[i][j]);
                cnt++;
            }
            minc++;
            for (int i = maxr, j = minc; j <=maxc && cnt<tne; j++) {
                System.out.println(arr[i][j]);
                cnt++;
            }
            maxr--;
            for (int i = maxr, j = maxc; i >= minr && cnt<tne; i--) {
                System.out.println(arr[i][j]);
                cnt++;
            }
            maxc--;
            for (int i = minr, j = maxc; j >= minc && cnt<tne; j--) {
                System.out.println(arr[i][j]);
            cnt++;
        }
        minr++;
        }
    }
}

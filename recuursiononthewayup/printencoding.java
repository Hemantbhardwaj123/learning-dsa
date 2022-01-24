package recuursiononthewayup;

import java.util.*;

public class printencoding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        printEncoding(str, "");
    }

    public static void printEncoding(String str, String ans) {
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        } else if (str.length() == 1) {
            char ch = str.charAt(0);
            if (ch == 0) {
                return;
            } else {
                int ch1 = ch - '0';
                char code = (char) ('a' + ch1 - 1);
                ans = ans + code;
                System.out.println(ans);
            }
        } else {
            char ch = str.charAt(0);
            String ros = str.substring(1);
            if (ch == '0') {
                return;
            } else {
                int ch1 = ch - '0';
                char code = (char) ('a' + ch1 - 1);
                printEncoding(ros, ans + code);
            }

            String ch12 = str.substring(0, 2);
            String roq = str.substring(2);
            int ch12v = Integer.parseInt(ch12);
            if (ch12v <= 26) {
                char code = (char) ('a' + ch12v - 1);
                printEncoding(roq, ans + code);
            }
        }
    }
}

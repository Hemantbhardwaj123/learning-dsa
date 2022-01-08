package stringstringbuilderarraylist;

import java.util.*;

public class stringwitheverytwoconsecutivecharacter {
    public static String Sol(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str.charAt(0));
        for (int i = 0; i < sb.length(); i++) {

            char curr = str.charAt(i);
            char prev = str.charAt(i - 1);
             int gap =curr - prev;
             sb.append(gap);
             sb.append(curr);
        }
        return sb.toString();
    }
    // problem

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(Sol(str));
    }
}

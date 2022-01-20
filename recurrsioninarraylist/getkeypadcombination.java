package recurrsioninarraylist;

import java.util.*;

public class getkeypadcombination {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        ArrayList<String> words = getKPC(str);
        System.out.println(words);
    }

    static String[] code = { ".;", "abc", "def", "ghi", "jkl", "mno",  "pqrs", "tu", "vwx", "yz" };

    public static ArrayList<String> getKPC(String str) {
        if (str.length() == 0) {
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }
        char ch = str.charAt(0);
        String gif = str.substring(1);
        ArrayList<String> ros = getKPC(gif);
        ArrayList<String> mres = new ArrayList<>();
        String codeforch = code[ch - '0'];
        for (int i = 0; i < codeforch.length(); i++) {
            char chcode = codeforch.charAt(i);
            for (String tir : ros) {
                mres.add(chcode + tir);
            }
        }
        return mres;
    }
}

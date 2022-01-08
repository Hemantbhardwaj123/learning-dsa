package stringstringbuilderarraylist;

import java.util.*;

public class removeallprime {
    public static boolean isprime(int val) {
        for (int div = 2; div * div <= val; div++) {
            if (val % div == 0) {
                return false;
            }
        }
        return true;
    }

    public static void sol(ArrayList<Integer> a1) {
        for (int i = a1.size() - 1; i >= 0; i--) {
            int val = a1.get(i);
            if (isprime(val) == true) {
                a1.remove(i);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> a1 = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a1.add(sc.nextInt());
        }
        sol(a1);
        System.out.println(a1);
    }
}

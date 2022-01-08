package stringstringbuilderarraylist;
import java.util.*;
public class permutationofstring {
    public static void sol(String str){
        int n=str.length();
        int fact=factorial(n);
        for(int i=0;i<fact;i++){
            StringBuilder sb= new StringBuilder(str);
            int temp=i;
            for(int j=n;j>=0;j--){
                int q=temp/j;
                int r=temp%j;
                System.out.print(sb.charAt(r));
                sb.deleteCharAt(r);
                temp=q;
            }
            System.out.println();
        }
    }
    public static int factorial(int n){
        int val=1;
        for(int i=2;i<n;i++){
            val *=i;
        }
        return val;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str =sc.next();
        sol(str);
    }
}

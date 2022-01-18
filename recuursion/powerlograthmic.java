package recuursion;
import java.util.*;
public class powerlograthmic {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int n =sc.nextInt();
        int p=power(x,n);
        System.out.println(p);
    }
    public static int power(int x,int n){
        if(n==0){
            return 1;
                }
                int pnb2=power(x,n/2);
                int pn=pnb2*pnb2;
                if(n%2==1){
                    pn=pn*x;
                }
                return pn;
            }
}

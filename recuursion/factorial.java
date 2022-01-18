package recuursion;
import java.util.*;
public class factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int f=Factorial(n);
        System.out.println(f);
    }
    public static int Factorial(int n){
       if(n==1){
           return 1;
       }
       int fnm1=Factorial(n-1);
       int fn =n*fnm1;
       return fn;
    }
}

package recuursion;
import java.util.*;
public class printzigzag {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        pzi(n);
        
    }
    public static void pzi(int n){
    if( n==0){
        return  ;
    
    }
    System.out.println(n);
    pzi(n-1);
    System.out.println(n);
    pzi(n-1);
    System.out.println(n);
}
}

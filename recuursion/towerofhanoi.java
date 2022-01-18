package recuursion;
import java.util.*;
public class towerofhanoi {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int n3=sc.nextInt();
        tower(n,n1,n2,n3);
    }
    public static void tower(int n,int n1,int n2,int n3){
      if(n==0){
          return;
      }
        tower(n-1,n1,n3,n2);
        System.out.println(  n + "[" + n1 +" -> " + n2 + "]" );
        tower(n-1,n3,n2,n1);
    }
}

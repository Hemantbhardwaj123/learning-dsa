package baseques;
import java.util.*;
public class anybasetoanybase {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int b1 = sc.nextInt();
        int b2 =sc.nextInt();
        int dn=fact(n,b1,b2);
        System.out.println(dn);

    }
    public static int fact(int n,int b1,int b2){
    int st =getValueIndecimal(n,b1);
    int des= fact(st,b2);
    return des ;
    }
    public static    int fact (int n,int b){
        int rv=0;
        int p=1;
        while(n>0){
            int dig=n%b;
            n=n/b;
            rv +=dig*p;
            p=p*10;
        }
        return rv;
            }
            
   public static int getValueIndecimal(int n, int b){
    int rv=0;
    int p=1;
    while(n>0){
        int dig =n%10;
        n=n/10;
        rv +=dig *p;
        p=p*b;
    
      }
    return rv;
 }
    
}

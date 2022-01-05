import java.util.*;
public class anybasemultiplication {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int b = sc.nextInt();
        int n1= sc.nextInt();
        int n2 = sc.nextInt();
        int rs=ifact(b,n1,n2);
        System.out.println(rs);
    }
    public static int ifact(int b,int n1,int n2){
        int rv=0;
        int p=1;
        while(n2>0){
        int d2=n2%10;
        n2=n2/10;
        int sprd=  mulof1digit(b,n1,d2);
        rv= fact(b,rv,sprd*p);
        p=p*10;
    }
        return rv;
    }
    public static int mulof1digit(int b,int n1,int d2){
        int rv=0;
        int c=0;
        int p=1;
        while(n1>0 || c>0){
            int d1 =n1%10;
            n1=n1/10;
        int d =d1*d2 +c;
        c=d/b;
        d=d%b;
        
        rv = rv+ d *p;
        p=p*10;}
        return rv;
    }
    public static int fact (int b,int n1,int n2){
        int rv=0;
        int p=1;
        int c=0;
        while(n1>0 ||n2>0 || c>0){
            int dig1=n1%10;
            int dig2 =n2%10;
            n1=n1/10;
            n2=n2/10;
        int dig=dig1 +dig2+ c;
        c=dig/b;
        dig=dig%b;
        
        rv += dig *p;
        p=p*10;
        }
        return rv;
            }
        
}

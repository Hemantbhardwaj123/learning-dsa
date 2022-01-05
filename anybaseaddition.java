import java.util.*;
public class anybaseaddition {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int b = sc.nextInt();
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int rs = fact(b,n1,n2);
        System.out.println(rs);
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

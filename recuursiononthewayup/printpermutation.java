package recuursiononthewayup;
import java.util.*;
public class printpermutation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        printPermutation(str,"");
    }
    public static void printPermutation(String str,String asf){
       if(str.length()==0){
           System.out.println(asf);
           return;
       }
       for(int i=0;i<str.length();i++){
        char ch =str.charAt(i);
        String lp=str.substring(0,i);
        String rp=str.substring(i+1);
        String ros=lp +rp;
            printPermutation(ros,asf +ch);
       }
    }
}

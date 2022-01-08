
package stringstringbuilderarraylist;
import java.util.*;
public class togglecase {
    public static String toggle(String str){
        StringBuilder sb = new StringBuilder(str);
        for(int i=0;i<sb.length();i++){
          char ch=sb.charAt(i);
            if(ch>='A' && ch<='Z'){
                char lch =(char)('a'+ch-'A');
                sb.setCharAt(i,lch);
            }else if(ch>='a' && ch<='z'){
                char uch =(char)('A'+ch-'a');
                sb.setCharAt(i,uch);
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str =sc.nextLine();
        System.out.println(toggle(str));
        }
}

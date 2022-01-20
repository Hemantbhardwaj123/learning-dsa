package recurrsioninarraylist;
import java.util.*;
public class subsequence {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        ArrayList<String>res=ssr(str);
        System.out.println(res);
    }
    public static ArrayList<String> ssr( String str){
       if(str.length()==0){
           ArrayList<String> tis=new ArrayList<>();
           tis.add("");
           return tis;
       }
        char ch=str.charAt(0);
        String rres=str.substring(1);
        ArrayList<String> mres=ssr(rres);

        ArrayList<String> list=new ArrayList<>();
        for(String mos:mres){
            list.add(""+ mos);
        }
        for(String mos:mres){
            list.add(ch+ mos);
        }
        return list;
    }
}

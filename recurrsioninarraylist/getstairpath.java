package recurrsioninarraylist;
import java.util.*;
public class getstairpath {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<String> paths=getStair(n);
        System.out.println(paths);   
    }
    public static ArrayList<String> getStair(int n){
        if(n==0){
            ArrayList <String> bres=new ArrayList<>();
            bres.add("");
            return bres;
        }else if(n<0){
                ArrayList <String> bres=new ArrayList<>();
                return bres;
            }
        
        ArrayList<String> path1=getStair(n-1);
        ArrayList <String> path2=getStair(n-2);
        ArrayList <String> path3=getStair(n-3);
        ArrayList <String> paths =new ArrayList<>();
        for(String tir:path1){
            paths.add( 1 + tir);
        }
        for(String tir:path2){
            paths.add( 2 + tir);
        }
        for(String tir:path3){
            paths.add( 3 + tir);
        }
        return paths;
    }
}

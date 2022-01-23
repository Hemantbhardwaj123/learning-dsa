package recuursiononthewayup;
import java.util.*;
public class printMazePathsJumps {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        printMazeJumps(1,1,n,m,"");

    }
    public static void printMazeJumps(int sr,int sc,int dr, int dc,String psf){
        if(sr==dr && sc==dc){
            System.out.println(psf);
            return;
        }
        for(int ms=1;ms<=dc-sc;ms++){
            printMazeJumps(sr,sc+ms,dr,dc,psf +"h"+ms);
        }
        for(int ms=1;ms<=dr-sr;ms++){
            printMazeJumps(sr+ms,sc,dr,dc,psf +"v"+ms);
        }
        for(int ms=1;ms<=dr-sr && ms<=dc-sc;ms++){
            printMazeJumps(sr+ms,sc+ms,dr,dc,psf +"d"+ms);
        }
    }
}

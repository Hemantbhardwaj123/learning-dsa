package recurrsioninarraylist;
import java.util.*;
public class getmazepathwithjump {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        ArrayList<String> path= getMazeJump(1,1,n,m);
        System.out.println(path);
    }
    public static ArrayList<String> getMazeJump(int sr,int sc,int dr,int dc){
        if(sr==dr && sc==dc){
            ArrayList<String> bres=new ArrayList <>();
            bres.add("");
            return bres;
        }
        ArrayList<String> paths= new ArrayList<>();
        for(int ms=1;ms<=dc-sc;ms++){
            ArrayList<String> hpaths=getMazeJump(sr,sc+ms,dr,dc);
            for(String hpath:hpaths){
                paths.add("h" +ms+hpath);
            }
        }
        for(int ms=1;ms<=dr-sr;ms++){
            ArrayList<String> vpaths=getMazeJump(sr+ms,sc,dr,dc);
            for(String vpath:vpaths){
                paths.add("v"+ms+vpath);
            }
        }
        for(int ms=1;ms<=dc-sc && ms<=dr-sr;ms++){
            ArrayList<String> dpaths=getMazeJump(sr +ms,sc+ms,dr,dc);
            for(String dpath:dpaths){
                paths.add("d" +ms+dpath);
            }
        }
        return paths;
    }
}

// import java.io.*;

// import java.util.*;

// public class Main {

//   public static void main(String[] args) throws Exception {

//     Scanner scn = new Scanner(System.in);
//     int n = scn.nextInt();
//     int m = scn.nextInt();

//     ArrayList< String> paths = getMazePaths(1, 1, n, m);

//     System.out.println(paths);
//   }

//   // sr - source row
//   // sc - source column
//   // dr - destination row
//   // dc - destination column
//   public static ArrayList< String> getMazePaths(int sr, int sc, int dr, int dc) {

//     if (sr == dr && sc == dc)
//     {
//       ArrayList< String> bres = new ArrayList< >();
//       bres.add("");
//       return bres;
//     }
//     else if (sr > dr || sc > dc)
//     {
//       ArrayList< String> bres = new ArrayList< >();
//       return bres;
//     }

//     ArrayList< String> paths = new ArrayList< >();
//     for (int hms = 1; hms <= dc - sc; hms++)
//     {
//       ArrayList< String> hpaths = getMazePaths(sr, sc + hms, dr, dc);

//       for (String hpath : hpaths)
//       {
//         paths.add("h" + hms + hpath);
//       }
//     }

//     for (int vms = 1; vms <= dr - sr; vms++)
//     {
//       ArrayList< String> vpaths = getMazePaths(sr + vms, sc, dr, dc);

//       for (String vpath : vpaths) {
//         paths.add("v" + vms + vpath);
//       }
//     }

//     for (int dms = 1; dms <= dr - sr && dms <= dc - sc; dms++)
//     {
//       ArrayList< String> dpaths = getMazePaths(sr + dms, sc + dms, dr, dc);

//       for (String dpath : dpaths)    {
//         paths.add("d" + dms + dpath);
//       }
//     }
//     return paths;
//   }
// }

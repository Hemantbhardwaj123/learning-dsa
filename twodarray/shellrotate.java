package twodarray;
import java.util.*;
public class shellrotate {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int [][]ar=new int[n][m];
        for(int i=0;i<ar.length;i++){
            for(int j=0;j<ar[0].length;j++){
                ar[i][j]=sc.nextInt();
            }
        }
        int s=sc.nextInt();
        int r=sc.nextInt();
       
        rotateshell(ar,s,r);
        display(ar);
    }
    public static void rotateshell(int [][]ar,int s,int r){
        int []oned=fillonedfromshell(ar,s);
        rotate(oned,r);
        shellfromoned(ar,s,oned);
    }
    public static int[] fillonedfromshell(int [][]ar,int s ){
        int minr=s-1;
        int minc=s-1;
        int maxr=ar.length-s;
        int maxc=ar[0].length-s;
        int sz=2*(maxr-minr+maxc-minc);
        int[]oned=new int[sz];
        int idx=0;
        for(int i=minr,j=minc;i<=maxr;i++){
            oned[idx]=ar[i][j];
            idx++;
        }
        for(int i=maxr,j=minc + 1;j<=maxc;j++){
            oned[idx]=ar[i][j];
            idx++;
        }
        for(int i=maxr-1,j=maxc;i>=minr;i--){
            oned[idx]=ar[i][j];
            idx++;
        }
        for(int i=minr,j=maxc-1;j>=minc+1;j--){
            oned[idx]=ar[i][j];
            idx++;
        }
        return oned;
    }
    public static void shellfromoned(int[][]ar,int s,int []oned){
        int minr=s-1;
        int minc=s-1;
        int maxr=ar.length-s;
        int maxc=ar[0].length-s;
        int idx=0;
        for(int i=minr,j=minc;i<=maxr;i++){
            ar[i][j]=oned[idx];
            idx++;
        }
        for(int i=maxr,j=minc + 1;j<=maxc;j++){
            ar[i][j]=oned[idx];
            idx++;
        }
        for(int i=maxr-1,j=maxc;i>=minr;i--){
            ar[i][j]=oned[idx];
            idx++;
        }
        for(int i=minr,j=maxc-1;j>=minc+1;j--){
            ar[i][j]=oned[idx];
            idx++;
        }
    }
    public static void rotate(int []oned,int r){
        r=r%oned.length;
        if(r<0){
            r=r+oned.length;
        }
        reverse(oned,0,oned.length-r-1);
        reverse(oned,oned.length-r,oned.length-1);
        reverse(oned,0,oned.length-1);
    }
    public static void reverse(int []oned,int li,int ri ){
        while(li<ri){
            int temp=oned[li];
            oned[li]=oned[ri];
            oned[ri]=temp;
            li++;
            ri--;
        }
    }

    public static void display(int [][]ar){
        for(int i=0;i<ar.length;i++){
            for(int j=0;j<ar[0].length;j++){
                System.out.print(ar[i][j]+" ");
            }
            System.out.println();
        }
    }
}

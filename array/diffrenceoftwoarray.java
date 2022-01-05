package array;
import java.util.*;
public class diffrenceoftwoarray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n1=sc.nextInt();
        int []a1=new int[n1];
        for(int i=0;i<a1.length;i++){
            a1[i]=sc.nextInt();
        }
        int n2=sc.nextInt();
        int []a2=new int[n2];
        for(int i=0;i<a2.length;i++){
            a2[i]= sc.nextInt();
        }
        int []dif =new int[n2];
        int c=0;
        int i=a1.length-1;
        int j=a2.length-1;
        int k=dif.length-1;
        while(k>=0){
            int d=0;
            
            int a1v=i>=0?a1[i]:0;
            if(a2[j] + c>=a1v){
                d = a2[j]+c-a1v;
                c=0;
            }else{
                d = a2[j]+c+10-a1v;
                c=-1;
            }
            dif[k]=d;
            i--;
            j--;
            k--;
        }
        int idx=0;
        while(idx<dif.length){
            if(dif[idx]==0){
                idx++;
            }else{
                break;
            }
        }
        while(idx<dif.length){
            System.out.println(dif[idx++]);

        }
    }}
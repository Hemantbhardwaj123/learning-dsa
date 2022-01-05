package array;
import java.util.*;
public class firstandlastindex {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]= new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int data=sc.nextInt();
        int lo=0;
        int hi=arr.length-1;
        int idx1=0;
        while(lo<=hi){
            int m=(lo+hi)/2;
            if(data>arr[m]){
                lo=m+1;
            }else if(data<arr[m]){
                hi=m-1;
            }else{
                idx1=m;
                hi=m-1;
            }
        }
        System.out.println(idx1);
        
         lo=0;
         hi=arr.length-1;
        int idx2=0;
        while(lo<=hi){
            int m=(lo+hi)/2;
            if(data>arr[m]){
                lo=m+1;
            }else if(data<arr[m]){
                hi=m-1;
            }else{
                idx2=m;
                lo=m+1;
            }
        }
        System.out.println(idx2);
    }
}

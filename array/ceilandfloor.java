package array;
import java.util.*;
public class ceilandfloor {
 public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    int n =sc.nextInt();

    int arr[]=new int[n];
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();                       problem
    }
    
    int lo=0;
    int hi=arr.length-1;
    int data=sc.nextInt();
    int cl=0;
    int fl=0;
    while(cl<=fl){
        int m=(lo+hi)/2;
        if(data<arr[m]){
            hi=m-1;
            cl=arr[m];
        }else if
            (data>arr[m]){
                lo=m+1;
                fl=arr[m];
        }else{
            fl=arr[m];
            cl=arr[m];
            break;
        }
    }
    System.out.println(cl);
    System.out.println(fl);
    }   
}

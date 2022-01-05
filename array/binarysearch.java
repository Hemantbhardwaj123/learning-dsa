package array;

public class binarysearch {
    public static void main(String[] args) {
      int  arr[]={1,2,3,4,5,6,7,8,9,10};
    int data=4;
    int l=0;
    int h=arr.length-1;
    while(l<=h){
        int m=(l+h)/2;
        if(data>arr[m]){
            l=m+1;
        }else if(data<arr[m]){
            h=m-1;
        }else{
        System.out.println(m);
        return;
    }}
    System.out.println(-1);    
}
}

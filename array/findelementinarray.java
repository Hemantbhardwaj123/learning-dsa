package array;
import java.util.*;
public class findelementinarray {
    public static void main(String[] args) throws Exception {
        
    
    Scanner sc = new Scanner(System.in);
    int n= sc.nextInt();
    int []arr=new int[n];
    for(int i=0;i<arr.length;i++){
        arr[i]=sc.nextInt();
    }
    int data =sc.nextInt();
    int ind=-1;
for( int i=0;i<arr.length;i++){
    if(arr[i]==data){
        ind=1;
        break;
    }
}
System.out.println(ind);
}
}
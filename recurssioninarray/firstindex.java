package recurssioninarray;

import java.util.*;

public class firstindex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        int fis = firstIndex(arr, 0, x);
        System.out.println(fis);
    }

    public static int firstIndex(int[] arr, int idx, int x) {
        if (idx == arr.length) {
            return -1;
        }
       if(arr[idx]==x){
           return idx;
       }else{
           int fisa=firstIndex(arr,idx+1,x);
           return fisa;
       }
        }
    }


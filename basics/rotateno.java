package basics;

import java.util.Scanner;

public class rotateno {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k= sc.nextInt();
		 int temp=n;
		 int node=0;
		 while(n>0) {
			 temp= n / 10 ;
			 node++;
		 }
		int div=1;
		int mult=1;
		for(int i =0 ;i<=node;i++) {
			if(i<=k) {
				div=div*10;}
			else {mult=mult*10;
			}}
			int q =n/div;
			int r = n%div;
			
			 r=r *mult +q;
			 System.out.println(r);
			
		
	// problem
			
					
		

	}

}

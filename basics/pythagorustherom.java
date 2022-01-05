package basics;

import java.util.Scanner;

public class pythagorustherom {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a= sc.nextInt();
		int b= sc.nextInt();
		int c= sc.nextInt();
		int max=a;
		if(b>=max)
		{b=max;}
		if(c>=max) {
			c=max;
		}
		if(a==max) {
			boolean flag=((b*b + c*c)==(a*a));
			System.out.print(flag);
		}
		else if(b==max){
			boolean flag=((a*a + c*c)==(b*b));
		}else {
			boolean flag=((a*a +b*b)==(c*c));
			System.out.print(flag);
		}
		
					
		
	}

}

package basics;

import java.util.Scanner;

public class calculator {

	public static void main(String[] args) {
		
       Scanner sc = new Scanner(System.in);
		
    System.out.println(" Enter the first no ");
	    int a =sc . nextInt();
	     System.out.println("Enter the second number");
	     int b = sc.nextInt();
	     System.out.println(" the operation u want to use ");
	     sc.nextLine();
	     char operation = sc.nextLine().charAt(0);
	      int result = 0;
	      
	      switch(operation){
	      case'1':
	    	  result = a+b;
	    	  break;
	      case'-':
	    	  result = a-b;
	    	  break;
	      case'*':
	    	  result = a*b;
	    	  break;
	      case'/':
	    	  result = a/b;
	    	  break;
	      case'&':
	    	  result = a&b;
	    	  break;
	      case'|':
	    	  result=a|b;
	    	  break;
	    	  default:
	    		  System.out.println("invalid operation");
	      }
	      System.out.println("the result is" + result);
	    	  
	    	  
	      
	      }

	

	    
	    
	}

	

		
	



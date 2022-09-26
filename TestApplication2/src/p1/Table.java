package p1;

import java.util.Scanner;

public class Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
	      int n=sc.nextInt();
	      int r1=sc.nextInt();
	      int r2=sc.nextInt();
	      for(int i=r1;i<=r2;i++)
	      {
	    	  System.out.println(n+"*"+i+":-"+(n*i));
	    	  
	      }
		}
	}




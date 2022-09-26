package p1;
import java.util.*;
public class AccountBalance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int bal[]={10000,2000,5500,60000,12000};
		int index1=sc.nextInt();
		System.out.println("Enter the index value:"+index1);
		int amount=sc.nextInt();
		System.out.println("Enter the amount to be transfered is:"+amount);
		int index2=sc.nextInt();
		System.out.println("Enter the index value of payee is:"+index2);
		if(bal[index1]>amount)
		  bal[index1]-=amount;
		if(bal[index2]>=5000)
		  bal[index2]+=amount;
		for(int i=0;i<bal.length-1;i++)
		     System.out.print(bal[i]+",");
		System.out.print(bal[bal.length-1]);
		}
	}
       
	



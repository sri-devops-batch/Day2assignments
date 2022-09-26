package p1;

public class MultipleEmployees {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int employee[]= new int[5];
     int n= employee.length;
     employee[0]=50000;
     employee[1]=25000;
     employee[2]=30000;
     employee[3]=40000;
     employee[4]=15000;
     System.out.println("Salary of the Employee 1:" +employee[0]);
     System.out.println("Salary of the Employee 2:" +employee[1]);
     System.out.println("Salary of the Employee 3:" +employee[2]);
     System.out.println("Salary of the Employee 4:" +employee[3]);
     System.out.println("Salary of the Employee 5:" +employee[4]);
     for(int i=0;i<employee.length;i++)
     {
    	 int monthlysalary=employee[i];
    	 System.out.println("===employee===" +i);
    	 int hra=(monthlysalary*20)/100;
    		int da=((monthlysalary*40)/100)+hra;
    		int ta=0;
    		int tax=0;
    		int basicsalary=monthlysalary+hra+da;
    		if(basicsalary>500000)
    		{
    			ta=(basicsalary*10)/100;
    		}
    		int annualsalary=monthlysalary+hra+da;
    		int taxamount;
    		if(basicsalary>50000)
    		{
               tax=0;
    		}
    		else if(annualsalary>500000 && annualsalary<1000000)
    		{
    			tax=(annualsalary*10)/100;
    			
    		}
    		else if (annualsalary>100000  && annualsalary<2000000)
    		{
    			tax=(annualsalary*20)/100;
    		}
    		else if(annualsalary>200000)
    		{
    			tax=(annualsalary*30)/100;
    		}
    		System.out.println("Taxable salary is:" +annualsalary);
    		System.out.println("taxamount is :"+tax);
    		int Salary=annualsalary-tax;
    		System.out.println("salary after tax deduction is :"+Salary);
     }
     
	}
	
}

    		

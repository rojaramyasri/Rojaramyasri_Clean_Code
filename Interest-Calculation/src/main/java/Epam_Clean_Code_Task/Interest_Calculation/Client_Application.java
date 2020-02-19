package Epam_Clean_Code_Task.Interest_Calculation;
import java.util.Scanner;
public class Client_Application extends SimpleandCompoundInterest
{
	public static void main(String[] args) 
	{	
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your Choice 1.Simple interest 2.Compound Interest");
        int choice=sc.nextInt();
        if(choice==1)
        {
        	SimpleandCompoundInterest object=new SimpleandCompoundInterest();
        	int principle_amount,time;
        	double rate_of_interest;
        	System.out.println("Enter Principle Amount, Time( in months), and Rate of Interest");
        	principle_amount=sc.nextInt();
        	time=sc.nextInt();
        	rate_of_interest=sc.nextDouble();
        	double simple_interest=object.SimpleInterest(principle_amount,time,rate_of_interest);
        	System.out.println("Simple Interest is: "+simple_interest);
        }
        else if(choice==2)
        {
        	SimpleandCompoundInterest object=new SimpleandCompoundInterest();
        	int principle_amount,time,no_of_compounding_periods;
        	double rate_of_interest;
        	System.out.println("Enter Principle Amount, Time( in months), and Rate of Interest,Number of Compounding periods");
        	principle_amount=sc.nextInt();
        	time=sc.nextInt();
        	rate_of_interest=sc.nextDouble();
        	no_of_compounding_periods=sc.nextInt();
        	double compound_interest=object.CompoundInterest(principle_amount,time,rate_of_interest,no_of_compounding_periods);
        	System.out.println("Compound Interest is: "+compound_interest);
        }
        else
        	System.out.println("Sorry! You have entered wrong/invalid option");
     sc.close();   
	}

}

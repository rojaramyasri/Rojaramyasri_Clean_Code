package Epam_Clean_Code_Task.Interest_Calculation;
class SimpleandCompoundInterest 
{
     public double SimpleInterest(int Principle_amount,int time,double rate_of_interest)
     {
    	 double simple_interest=0.0;
    	 simple_interest=(Principle_amount*time*rate_of_interest)/100;
    	 return simple_interest;
     }
     public double CompoundInterest(int Principle_amount,int time,double rate_of_interest,int no_of_compounding_periods)
     {
    	 double compound_interest=Principle_amount*Math.pow((1+rate_of_interest/no_of_compounding_periods),
    			 (no_of_compounding_periods*time));
    	 return compound_interest;
     }
}

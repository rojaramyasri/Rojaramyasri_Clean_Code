package Epam_Clean_Code_Task_Construction_cost.Construction_Cost;

class Construction_Cost 
{
     public double construction_total_cost(String material_standarad,double total_area_of_house,boolean automated_home)
     {
    	 if(material_standarad.equals("standarad materials"))
    	 {
    		 double total_cost=1200;
    		 if(automated_home==true)
    			 total_cost=total_cost+700;
    		 return total_cost*total_area_of_house;
    	 }
    	 else if(material_standarad.equals("above standarad materials"))
         { 
	          double total_cost=1500;
	          if(automated_home==true)
	          {
	        	  total_cost=total_cost+700;
	          }
	          total_cost=total_cost*total_area_of_house;
	          return total_cost;
         }
    	 else if(material_standarad.equals("high standarad materials"))
         { 
	          double total_cost=1800;
	          if(automated_home==true)
	          {
	        	  total_cost=total_cost+700;
	          }
	          total_cost=total_cost*total_area_of_house;
	          return total_cost;
         }
    	 else if(material_standarad.equals("above standarad materials"))
         { 
	          double total_cost=1500;
	          if(automated_home==true)
	          {
	        	  total_cost=total_cost+700;
	          }
	          total_cost=total_cost*total_area_of_house;
	          return total_cost;
         }
    	 else
    	 {
    		 return 0.0;
    	 }
     }
}

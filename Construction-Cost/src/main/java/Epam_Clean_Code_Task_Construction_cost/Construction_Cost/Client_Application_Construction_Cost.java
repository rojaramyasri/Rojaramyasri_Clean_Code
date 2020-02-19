package Epam_Clean_Code_Task_Construction_cost.Construction_Cost;
import java.util.Scanner;
public class Client_Application_Construction_Cost 
{
	public static void main(String[] args)
	{
      Scanner scan=new Scanner(System.in);
      String standarad_materials;
      double total_area_of_house;
      boolean automated_house;
      System.out.println("Enter the details for the following:\n 1.Standarad of Materials 2.Total area of house (in square feet only) 3.Automated house(True or False)");
      standarad_materials=scan.nextLine();
      total_area_of_house=scan.nextDouble();
      automated_house=scan.nextBoolean();
      Construction_Cost object=new Construction_Cost();
      double total_construction_cost=object.construction_total_cost(standarad_materials,total_area_of_house,automated_house);
      System.out.println("Total Construction Cost is:"+total_construction_cost);
      scan.close();
    }
}

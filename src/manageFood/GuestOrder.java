package manageFood;

import java.util.ArrayList;
import java.util.Scanner;

public class GuestOrder 
{
	public String IdTable;
	ArrayList<Food> EatList = new ArrayList<Food>();
	public float TotalPayment;
	
	public String getIdTable()
	{
		return IdTable;
	}
	
	public void setEatList(Food food)
	{
		EatList.add(food);
	}
	
	public void setTotalPayment(float TotalPayment)
	{
		this.TotalPayment= TotalPayment;
	}
	public void input() 
	{
		Scanner sc  = new Scanner(System.in);
		System.out.println("number Table");
		IdTable = sc.nextLine();
	}
	
	public void print()
	{
		System.out.println("...............................");
		System.out.println("numbeer table: "+this.IdTable+"Total Payment"+this.TotalPayment);
		for(Food m:this.EatList)
		{
			System.out.println("Selected Food is "+m.Name);

		}
		
		System.out.println();

	}

}

package manageFood;

import java.util.Scanner;

public class Food 
{
	public String Name;
	public float Price;
	
	public Food(String nm, float pr)
	{
		this.Name = nm;
		this.Price = pr;
	}

	public Food() {
		 
	}

	public void input()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the food Name ");
		
		Name = sc.nextLine();
		System.out.println("Enter the price of the food");
		Price = sc.nextFloat();
	}
	
	public void Payment()
	{
		System.out.println("Price "+ Price);
	}
	
	public String detail()
	{
		return Name+" "+Price;
	}
	
	public String getName()
	{
		return Name;
	}
	
	public void setName(String Name)
	{
		this.Name = Name;
	}
	
	public void setPrice(Float Price)
	{
		this.Price=Price;
	}
}

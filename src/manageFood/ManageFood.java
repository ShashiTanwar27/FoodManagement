package manageFood;

import java.util.ArrayList;
import java.util.Scanner;

public class ManageFood 
{
	ArrayList<Food> foodlist = new ArrayList<>();
	ArrayList<GuestOrder> guestorder = new ArrayList<>();
	Food Food;
	public GuestOrder GuestOrder;
	public int selectFood;
	
	public ManageFood() {}
	
	Scanner sc = new Scanner(System.in);
	
	public void sc()
	{
		System.out.println("Enter food in the menu");
		int n  = Integer.parseInt(sc.nextLine());
		for(int i = 0 ; i< n; i++)
		{
			Food food = new Food();
			food.input();
			foodlist.add(food);
		}
	}
	
	public void print()
	{
		for(int i = 0;i<foodlist.size(); i++)
		{
			System.out.println((i+1)+"."+foodlist.get(i).detail());
		}
	}
	
	public void Price()
	{
		float PriceFood = 0;
		float Totalpayment = 0;
		int number;
		GuestOrder guest = new GuestOrder();
		guest.input();
		guestorder.add(guest);
		for(int i = 0; i < 10; i++)
		{
			System.out.println("Selected food"+(i+1));
	        selectFood = sc.nextInt();
	        if(selectFood == 0)
	        {
	        	guest.setTotalPayment(Totalpayment);
	        	System.out.println("Total Payment");
	        	System.out.println(Totalpayment);
	        	System.out.println("Thank you,see you again...");
	        	break;
	        }else {
	        	System.out.println("Enter number");
	        	number = sc.nextInt();
	        	Food food = foodlist.get(selectFood - 1);
	        	guest.setEatList(food);
	        	PriceFood = Food.Price*number;
	        }
	        Totalpayment+=PriceFood;
	        System.out.println("Order Finish");
	        System.out.println("Payment "+(i+1)+" is: ");
	        System.out.println(" "+PriceFood);
	        System.out.println("Finish Order enter 0");   
		}
	}
	public void PrintOrder()
	{
		for(int i =0 ;i< guestorder.size();i++)
		{
			guestorder.get(i).print();
		}
	}
	
	public void search()
	{
		Scanner sc  = new Scanner(System.in);
		String idtable;
		int up = 0;
		System.out.println("Enter table number payment");
		idtable = sc.nextLine();
		for(int i= 0; i < guestorder.size() ; i++)
		{
			if(guestorder.get(i).getIdTable().equalsIgnoreCase(idtable)) {
			guestorder.get(i).print();
			up++;
	       }
	    }
	if(up == 0)
		{
		 System.out.println("no table number"+idtable);
		}
     }
	
	public String EditName() 
	{
		System.out.println("Enter name edit: ");
		return sc.nextLine();
	}
	
	public float EditPrice() 
	{
		System.out.println("Enter Price edit: ");
		return sc.nextFloat();
	}
     
	public void EditFood() {
		String namefood;
		int up=0;
		System.out.println("Enter name food to fix: ");
		namefood = sc.nextLine();
		for(int i =0 ; i< foodlist.size();i++)
		{
			if(foodlist.get(i).getName().equals(namefood)) {
				up++;
				foodlist.get(i).setName(EditName());
				foodlist.get(i).setPrice(EditPrice());
				break;
			}
		}if (up == 0) {
			System.out.println("no food name is "+ namefood);
		}
	}
	public void DeleteFood()
	{
		String deletefood;
		int up = 0;
		System.out.println("Enter name food to delete");
		deletefood = sc.nextLine();
		for(int i =0 ; i< foodlist.size();i++)
		{
			if(foodlist.get(i).getName().equals(deletefood)) {
				up++;
				foodlist.remove(i);
				System.out.println("delete finish");
				break;
			}
		}if (up == 0) {
			System.out.println("no food name is "+ deletefood);
		}
	}
	}
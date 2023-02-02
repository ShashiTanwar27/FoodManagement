package manageFood;

import java.util.ArrayList;
import java.util.Scanner;

public class TestMain
{
	 public static void main(String...g)
	 {
		 ArrayList<Food> foodlist = new ArrayList<>();
		 ManageFood managefood = new ManageFood();
		 int select;
		 
		/** managefood.sc();
		 managefood.print();
		 
		 managefood.Price();
		 managefood.PrintOrder();
		 */
		 
		 Scanner sc = new Scanner(System.in);
		 do {
			 Menumain();
			 select = Integer.parseInt(sc.nextLine());
			 switch (select) {
			 case 1:
				 do {
					 MenuManageFood();
					 select = Integer.parseInt(sc.nextLine());
					 switch (select) {
					 case 1:
						 managefood.sc();
					     break;
					 case 2:
						 managefood.print();
						 managefood.EditFood();
						 break;	 
					 case 3:
						 managefood.print();
						 managefood.DeleteFood();
						 break;	
					 case 4:
						 managefood.PrintOrder();
						 break;	 
					 case 5:
						 managefood.search();
						 break;	 
					 case 0:
						  System.out.println("Back");
						 break;	 
					 
					 default:
					     break;
					 }
				 }while(select != 0);
			
			     break;
			 case 2:
				 do {
					 MenuOrder();
					 select = Integer.parseInt(sc.nextLine());
					 switch (select) {
					 case 1:
						 managefood.sc();
					     break;
					
					 case 0:
						  System.out.println("Back");
						 break;	 
					 
					 default:
					     break;
					 }
				 }while(select != 0);
			
			     break;
				 
			 
			 default:
			     break;
			 }
		 }while(select != 3);
		 
	 }
	 
	 static void MenuManageFood() {
		 System.out.println("----- MENU MANAGE FOOD------");
		 System.out.println("0.BACK TO menu main");
		 System.out.println("1.Add Food");
		 System.out.println("2.Edit Food");
		 System.out.println("3.Delete Food");
		 System.out.println("4.Print info table order");
		 System.out.println("5.Payment");
		 System.out.println("--------------------------------");
		 System.out.println("select");
	 }
	 
	 static void MenuOrder() {
		 System.out.println("----- MENU ORDER------");
		 System.out.println("0.BACK TO menu main");
		 System.out.println("1.Print Menu food and Order");
		 System.out.println("----------------------------");
		 System.out.println("select");
	 }
		 
	 static void Menumain() {
		 System.out.println("----- Menu main------");
		 System.out.println("1.Manage Food");
		 System.out.println("2.Manage Order");
		 System.out.println("3.Exit");
	 }

}

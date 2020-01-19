package basics_java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class ecommerce {

	public static void main(String[] args) {
		String Name="";
		Scanner in=new Scanner(System.in);
		ArrayList<Product> product=new ArrayList<Product>();

		product.add(new Product(1,"pen",5,50.0));
		product.add(new Product(2,"pencil",5,8.90));
		product.add(new Product(3,"eraser",5,5.00));
		product.add(new Product(4,"monitor",5,4000.00));
		
		System.out.println("Enter your Name");
		Name=in.next();
		Order order=new Order();
                 HashMap<Integer, Order> placedorder = new HashMap<Integer, Order>();

		boolean ctrl=true;
		while(ctrl)
		{ 
			System.out.println("\n "
                                + "1)ADD CART \n "
                                + "2)DELETE CART\n "
                                + "3)VIEW CART \n "
                                + "4)PLACE ORDER\n "
                                + "5)CANCEL ORDER\n "
                                + "6)VIEW ORDER\n\n"
                                + " Enter You Choice (or)Press e to exit\n");
			String choice=in.next();
			switch (choice) 
			{
			  case "1":
				addcart(Name,product,order);
			    break;
			  case "2":
				  if(order.cart.isEmpty())
					{
						System.out.println("No Items in cart");
					}
					else {
						deletecart(order);
					}
			    break;
			  case "3":
				  System.out.println("<-----------------Your Cart------------------->");
				  order.display_cart();
			    break;
			  case "4":
                                if(order.cart.isEmpty())
				{
					System.out.println("No Item in Cart");
				}
				else {
				placedorder.put(order.Order_id, order); 
				order =new Order(order.Order_id+1);

				for(Integer mp  : placedorder.keySet())
				{
				    System.out.println("\nOrder ID : "+placedorder.get(mp).Order_id+"\nItems :");
				    for(String cart:placedorder.get(mp).cart)
				    {
					    System.out.print(cart+" ");
				    }
				    System.out.print("\nTotal :"+placedorder.get(mp).total);

				}
				  System.out.println("\n<-----------------Order Placed SucessFully------------------->");
				}
			    break;
			  case "5":
				  if(placedorder.isEmpty())
				  	{
				  		System.out.println(" No Orders to Cancel...\n");
				  	}
				  	else
				  	{
				 cancelorder(placedorder);
				  	}
			    break;
			  case "6":
				  	if(placedorder.isEmpty())
				  	{
				  		System.out.println("Sorry No Order Placed Yet...\n");
				  	}
				  	else
				  	{
					for(Integer mp  : placedorder.keySet())
					{
					    System.out.println("\nOrder ID : "+placedorder.get(mp).Order_id+"\nItems :");
					    for(String cart:placedorder.get(mp).cart)
					    {
						    System.out.print(cart+" ");
					    }
					    System.out.print("\nTotal :"+placedorder.get(mp).total);

					}
				  	}
			    break;
                           case "e":
                               ctrl=false;
                               break;
			  default:
			    ctrl=false;
			    break;
			}
		}
	    System.out.println("Thank you "+Name+".... Visit Again");
	    
	}
public static void cancelorder( HashMap<Integer, Order> placedorder)
{
	Scanner in=new Scanner(System.in);
	
	for(Integer mp  : placedorder.keySet())
	{
	    System.out.println("\nOrder ID : "+placedorder.get(mp).Order_id+"\nItems :");
	    for(String cart:placedorder.get(mp).cart)
	    {
		    System.out.print(cart+" ");
	    }
	    System.out.print("\nTotal :"+placedorder.get(mp).total);

	}
	System.out.println("\nEnter orderid to Delete");
	int choice=in.nextInt();
	if(placedorder.containsKey(choice))
	{
		placedorder.remove(choice);
		System.out.println("<-----------------Your Order Has Been Cancelled------------------->");

	}
	else {
		System.out.println("Order Id Not Found");
	}

}
public static void deletecart(Order order)
{
	Scanner in=new Scanner(System.in);
	
	for(String ed  : order.cart)
	{
	    System.out.println("Cart_items : "+ed);
	 
	}
	System.out.println("Enter Items Name to Delete");
	String choice=in.next();
	order.delete_cart(choice);
	order.display_cart();
	
}
public static void addcart(String Name, ArrayList<Product> product,Order order)
{
	Scanner in=new Scanner(System.in);
	boolean ctrl=true;
	while(ctrl)
	{
            System.out.println("Id\t Name\t  Qty Avbl \t Rate");
	for(Product ed  : product)
	{
	    System.out.println(""+ed.Product_id+"\t"+ed.Product_Name+"\t\t"+ed.Quantity_Available+"\t"+ed.rate);
	 
	}
	System.out.println("Enter Your Product Id to Add in your Cart (or) Press r key to Go back");
	String choice=in.next();
	switch (choice) 
	{
	  case "1":
		  
		order.Add_cart(Name, product.get(0).Product_Name, product.get(0).rate);
	    break;
	  case "2":
		order.Add_cart(Name, product.get(1).Product_Name, product.get(1).rate);
	    break;
	  case "3":
		order.Add_cart(Name, product.get(2).Product_Name, product.get(2).rate);
	    break;
	  case "4":
		order.Add_cart(Name, product.get(3).Product_Name, product.get(3).rate);
	    break;
          case "r":
               ctrl=false;
	    break;
	  default:
	    ctrl=false;
	    break;
	}
	
	}
	System.out.println("\n");
}
}

class Product
{
	int Product_id; 
	String Product_Name;
	int Quantity_Available;
	double rate;
	
	Product(int id,String Name,int qty,double rate)
	{
		this.Product_id=id;
		this.Product_Name=Name;
		this.Quantity_Available=qty;
		this.rate=rate;
	}
	
}

class Order
{
	int Order_id; 
	String User_name;
	ArrayList<String> cart;
	ArrayList<Integer> rates;

	double total;
	
	Order()
	{
		this.Order_id=1;
		this.cart=new ArrayList();
		this.rates=new ArrayList();
		this.total=0;
	}
	Order(int id)
	{
		this.Order_id=id;
		this.cart=new ArrayList();
		this.rates=new ArrayList();
		this.total=0;
	}
	public void Add_cart(String User_Name,String Product_name,double rate)
	{
		this.User_name=User_Name;
		this.cart.add(Product_name);
		this.rates.add((int) rate);
		this.total+=rate;
		System.out.println("\n Item Added ...");
		
	}
	public void delete_cart(String Product_name)
	{
		if(cart.isEmpty())
		{
			System.out.println(":( Sorry...No Items In Cart\n");
		}
		else
		{
		int bf_size=cart.size();
	
			
		System.out.println(Product_name+"\n");
		int id=this.cart.indexOf(Product_name);
		this.cart.remove(id);
		this.total-=this.rates.get(id);
		this.rates.remove(id);
		if(cart.size()==bf_size)
		{
			System.out.println(":(Sorry item not found\n");
		}
		}
		
		
	}
	public void display_cart()
	{
		if(cart.isEmpty())
		{
			System.out.println(":( Sorry...No Items In Cart\n");
		}
		else
		{
		System.out.println("Items\tRates\n");
		int j=0;
		
		for(String ed  : cart)
		{
			System.out.print(ed+"\t");	
			System.out.print(this.rates.get(j)+"\n");
			j++;
		}
		System.out.print("\nTotal :"+this.total+"\n");
		}
	}
	
	
}
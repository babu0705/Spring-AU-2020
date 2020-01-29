package controller;

import java.util.*;
import org.hibernate.*;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import model.Address;
import model.Buyer;
import model.Order;
import model.Product;
import model.Seller;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);													
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		int home_pin=641014, office_pin=12345; 
		String name="babu", email="babuvignesh.c@gmail.com", number="7598214070", home_street="coimbatore", office_street="bangalore";
		Address home = new Address(home_pin, home_street);
		Address office = new Address(office_pin, office_street);

		//Seller Addition
		Seller seller = new Seller(name, number, email, home, office);
		//Product
		String productName = "Laptop";
		String prodctDesc = "I7 processor";
		int price = 75432;
		Product product = new Product(productName, price, prodctDesc);
		product.setSeller(seller); 
		session.save(product);
		seller.getProductList().add(product);
		session.save(seller); 
		System.out.println("Product Added");
		session.getTransaction().commit();
		session.beginTransaction();
			
		//New Buyer	
		
		name="vignesh"; email="babu@gmail.com";
		Buyer buyer = new Buyer(name, number, email, home, office);
		
		List<Product> selected = new ArrayList<>();
		int pid = 0;
		boolean added = false;
		
		
		//View Products			
		List<Product> products = session.createQuery("from Product", Product.class).list();
		for (Product p : products)
		System.out.println(p.toString());
		
		//Add Products
		System.out.println("Enter Product id to add:");
		pid = sc.nextInt();
		selected.addAll(session.createQuery("from Product where productid = " + pid, Product.class).list());
		added = true;
		System.out.println("Product added Successfully!");
		
		//Order Place
		int orderid = 0;
		Order order = new Order();
		order.setBuyer(buyer);
		order.setProductList(selected);
		orderid = (Integer) session.save(order); // save order
		session.save(buyer);
		System.out.println(order.toString());
		System.out.println("Order Successful!");
		session.getTransaction().commit();
		session.beginTransaction();
		selected.clear();
		added = false;
		
		Query query = session.getNamedQuery("GET_ALL_ORDERS");
		List<Order> orders = query.list();
		if (orders.isEmpty())
				System.err.println("No Orders Placed!");
		else 
				for (Order o : orders)
					System.out.println(o.toString());
					
		sc.close();	
	}
}
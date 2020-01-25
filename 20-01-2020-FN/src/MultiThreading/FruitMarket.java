package MultiThreading;


import java.util.concurrent.ConcurrentHashMap;

public class FruitMarket {
	//public static Queue<String> fruit_inventory=new ConcurrentLinkedQueue<String>();
	static ConcurrentHashMap<String, Integer> inventory = new ConcurrentHashMap<String, Integer>(); 

	public static void main(String[] args)
	{
		   for(int i=0;i<15;i++)
	    {
	    new Thread(new Farmer(),"Farmer_"+i).start();
	    }
		for(int i=0;i<10;i++)
		{
		new Thread(new Consumer( ),"Consumer_"+i).start();;
		}
	
	   
	}
}

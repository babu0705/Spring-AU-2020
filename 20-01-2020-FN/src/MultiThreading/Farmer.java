package MultiThreading;

import java.util.Random;
public class Farmer implements Runnable{
	public static String[] fruittypes= {"apple","orange","grape","watermelon"};

	@Override
	public void run() {
		
		while(true)
		{
		synchronized (FruitMarket.inventory) {
			
			Random r=new Random();
			int randomNumber=r.nextInt(fruittypes.length);
			int sum = 0;
			for (int f : FruitMarket.inventory.values()) {
			    sum+=f;
			}
			if(sum<10)
				{
				Integer count = FruitMarket.inventory.get(fruittypes[randomNumber]);
				if (count == null) {
					FruitMarket.inventory.put(fruittypes[randomNumber], 1);
				}
				else {
					FruitMarket.inventory.put(fruittypes[randomNumber], count + 1);
				}
				System.out.println(Thread.currentThread().getName()+" \tPopulated the Fruit Inventory.\t Current Balance "+FruitMarket.inventory);
				FruitMarket.inventory.notify();
				}
			else
			{
				try
				{
					FruitMarket.inventory.wait();
				}
				catch(InterruptedException e)
				{
					System.out.println(e);
				}
			}
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		}
	}

}

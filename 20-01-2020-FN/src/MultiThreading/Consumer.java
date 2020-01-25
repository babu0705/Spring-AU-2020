package MultiThreading;

import java.util.Random;

public class Consumer implements Runnable{
	public static String[] fruittypess= {"apple","orange","grape","watermelon"};
		@Override
		public void run() {
			while(true)
			{
				Random r=new Random();
				int randomNumber=r.nextInt(fruittypess.length);
				int valuee=0;
				Integer count = FruitMarket.inventory.get(fruittypess[randomNumber]);
				synchronized (FruitMarket.inventory) {
					try {
						valuee=FruitMarket.inventory.get(fruittypess[randomNumber]);
					}
					catch(NullPointerException e) {	}
				if(valuee>=1)
					{
						synchronized(FruitMarket.inventory) {
							try {
						if(valuee>0) {
						
								FruitMarket.inventory.put(fruittypess[randomNumber], count - 1);
								System.out.println(Thread.currentThread().getName()+" \tConsumed "+fruittypess[randomNumber]+" \t\t    Current Balance"+FruitMarket.inventory);
								FruitMarket.inventory.notify();
							}
							}
							catch(NullPointerException e) {	}			
					}
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
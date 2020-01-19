package TriconsumerLambda;
import TriconsumerLambda.triconsumerinterface;

public class triconsumer {

	public static void main(String[] args) {
		triconsumerinterface<Integer, Integer,Integer> tri2 = (a,b,c)  -> System.out.println(a * b * c);
		tri2.accept(2,4,5); 
		}

}

//Prints 40 as output since all the 3 inputs get multiplied 
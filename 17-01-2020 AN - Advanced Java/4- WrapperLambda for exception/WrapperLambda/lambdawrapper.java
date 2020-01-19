package WrapperLambda;

import java.util.*;

public class lambdawrapper {
	
	public static void main(String[] ar) {
		List<Integer> integers = Arrays.asList(13, 92, 37, 110, 0, 20);
		integers.forEach(i -> {
		    try {
		        System.out.println(1000 / i);
		    } catch (ArithmeticException e) {
		        System.err.println(
		          "Arithmetic Exception occured : " + e.getMessage());
		    }
		});

	}
}

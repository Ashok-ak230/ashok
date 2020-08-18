import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Manufsort {
	public static void main(String[]args) {
		List<Integer> Car=new ArrayList<Integer>();
		Car.add(2019);
		Car.add(2014);
		Car.add(2015);
		Car.add(2012);
		Car.add(2005);
		Car.add(2009);
		Collections.sort(Car);
		for(int x:Car) {
			System.out.println(x);
		}
	}

}
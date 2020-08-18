import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Carsort {
	public static void main(String[]args) {
		List<String> Car=new ArrayList<String>();
		Car.add("tata");
		Car.add("ford");
		Car.add("bmw");
		Car.add("benz");
		Car.add("honda");
		Collections.sort(Car);
		for(String x:Car) {
			System.out.println(x);
		}
	}
}
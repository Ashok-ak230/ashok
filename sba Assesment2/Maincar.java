import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Vector;
	public class Maincar {
			Map<String,List<Car>> carstore;
			public void displayCarsByShowroomname(String Showroomname)
			{
				List<Car> cars=carstore.get(Showroomname);
				for(Car car:cars){
					System.out.println(car);
				}

				}
			public static void main(String[] args) {
				Car c1=new Car("gt",2011);
				Car c2=new Car("maruthi",2013);
				Car c3=new Car("nissan",2017);
				Car c4=new Car("waganar",2019);
				
				List<Car> cars=new ArrayList<Car>();
	
				cars.add(c1);
				cars.add(c2);
				cars.add(c3);
				cars.add(c4);
				
				Show showroom=new Show("Service",cars, 99);
  
				Car c5=new Car("benz",2013);
				Car c6=new Car("bmw",2012);
				Car c7=new Car("polo",2011);
				
				List<Car> cars1=new ArrayList<Car>();
				cars1.add(c5);
				cars1.add(c6);
				cars1.add(c7);
					Show showroom1=new Show("Service 2", cars1, 105);
 
					Maincar m= new Maincar();

					m.carstore=new HashMap<String,List<Car>>();
					m.carstore.put(showroom.getShowroomname(), showroom.getCars());
					m.carstore.put(showroom1.getShowroomname(),showroom1.getCars());


					m.displayCarsByShowroomname("Service 2");


			}
	}

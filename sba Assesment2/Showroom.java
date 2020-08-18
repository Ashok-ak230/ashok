import java.util.List;

public class Showroom {
	private String Showroomname;
	private int address;
	List<Car> cars;
	public String getShowroomname() {
		return Showroomname;
	}
	public void setShowroomname(String showroomname) {
		Showroomname = showroomname;
	}
	public int getAddress() {
		return address;
	}
	public void setAddress(int address) {
		this.address = address;
	}
	public List<Car> getCars() {
		return cars;
	}
	public void setCars(List<Car> cars) {
		this.cars = cars;
	}
	public Showroom(String showroomname, int address, List<Car> cars) {
		super();
		Showroomname = showroomname;
		this.address = address;
		this.cars = cars;
	}
	@Override
	public String toString() {
		return "Showroom [Showroomname=" + Showroomname + ", address=" + address + ", cars=" + cars + "]";
	}
	

}

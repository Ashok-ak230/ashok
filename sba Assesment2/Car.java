
public class Car {
	int Manufacyear;
	private String name;
	public int getManufacyear() {
		return Manufacyear;
	}
	public void setManufacyear(int manufacyear) {
		Manufacyear = manufacyear;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Car(int manufacyear, String name) {
		super();
		Manufacyear = manufacyear;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Car [Manufacyear=" + Manufacyear + ", name=" + name + "]";
	}
	public Car() {
		
	}
}

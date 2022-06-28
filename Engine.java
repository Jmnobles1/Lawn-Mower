
public class Engine {
	
	private String manufacturer;
	private double horsePower;
	private int cylinders;
	
	
	public Engine()
	{
		manufacturer = "None";
		cylinders = 0;
		horsePower = 0.0;
	}
	
	
	Engine(String manufacturer, int cylinders, double horsePower)
	{
		this.horsePower = horsePower;
		this.manufacturer = manufacturer;
		this.cylinders = cylinders;
		
	}


	public String getManufacturer() {
		return manufacturer;
	}


	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}


	public double getHorsePower() {
		return horsePower;
	}


	public void setHorsePower(double horsePower) {
		this.horsePower = horsePower;
	}


	public int getCylinders() {
		return cylinders;
	}


	public void setCylinders(int cylinders) {
		this.cylinders = cylinders;
	}
	
	public String toString()
	{
		
		return (manufacturer + "\n" + horsePower + "\n" + cylinders);
	}
	
}

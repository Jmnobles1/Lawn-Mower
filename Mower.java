
abstract public class Mower {
	
	private String manufacturer;
	private int year;
	private String serialNumber;
	private String type;
	
	
	public Mower()
	{
		manufacturer = "None";
		year = 0;
		serialNumber = "None";
		type = "None";
	}
	
	
	Mower(String manufacturer, int year, String serialNumber, String type)
	{
	    this.manufacturer = manufacturer;
	    this.year = year;
		this.serialNumber = serialNumber;
		this.type = type;
	}
	



    public String getManufacturer() {
        return manufacturer;
    }


    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }


    public int getYear() {
        return year;
    }


    public void setYear(int year) {
        this.year = year;
    }


    public String getSerialNumber() {
        return serialNumber;
    }


    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }


    public String getType() {
        return type;
    }


    public void setType(String type) {
        this.type = type;
    }


    public String toString() {
		return (manufacturer + "\n" + year + "\n" + serialNumber + "\n" + type);
	}
	
	
	
	
	

}

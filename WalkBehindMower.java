
abstract public class WalkBehindMower extends Mower{
	
	private double wheelDiameter;
	private double cutWidth;
	
	public WalkBehindMower()
	{
		wheelDiameter = 0.0;
		cutWidth = 0.0;
	}
	
	WalkBehindMower(String manufacturer, int year, String serialNumber,String type,
			double wheelDiameter, double cutWidth)
	{
		super(manufacturer, year, serialNumber,type);
		this.wheelDiameter = wheelDiameter;
		this.cutWidth = cutWidth;
	}

	
	public double getWheelDiameter() {
		return wheelDiameter;
	}



	public void setWheelDiameter(double wheelDiameter) {
		this.wheelDiameter = wheelDiameter;
	}



	public double getCutWidth() {
		return cutWidth;
	}



	public void setCutWidth(double cutWidth) {
		this.cutWidth = cutWidth;
	}



	public String toString() {
		return (super.toString() + "\n" + cutWidth + "\n" + wheelDiameter);
	}
	

}

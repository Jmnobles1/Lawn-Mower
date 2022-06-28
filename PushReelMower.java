
public class PushReelMower extends WalkBehindMower {
	
	private int numWheels;
	
	public PushReelMower()
	{
		numWheels = 0;
	}
	
	PushReelMower(String manufacturer, int year, String serialNumber, String type,
	        double wheelDiameter, double cutWidth, int numWheels)
    {
        super(manufacturer, year, serialNumber,type,wheelDiameter, cutWidth);
		this.numWheels = numWheels;	
	}
	
	
	public int getNumWheels() {
		return numWheels;
	}


	public void setNumWheels(int numWheels) {
		this.numWheels = numWheels;
	}


	public String toString() {
		return (super.toString() + "\n" + numWheels + "\n");
	}

}

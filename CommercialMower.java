
public class CommercialMower extends LawnTractor {
	
	private boolean zeroTurnRadius;
	private double operatingHours ;
	
	public CommercialMower()
	{
		
		operatingHours = 0.0;
		zeroTurnRadius = false;
	}
	
	CommercialMower(String manufacturer, int year, String serialNumber, String type,
	        Engine engine,String model,double deckWidth,
	        double operatingHours, boolean zeroTurnRadius)
    {
        super(manufacturer, year, serialNumber,type,engine, model, deckWidth);
	
		this.operatingHours  = operatingHours ;
		this.zeroTurnRadius = zeroTurnRadius;
		
	}
	

	



	public double getOperatingHours() {
		return operatingHours;
	}



	public void setOperatingHours(double operatingHours) {
		this.operatingHours = operatingHours;
	}
	
	public boolean isZeroTurnRadius() {
        return zeroTurnRadius;
    }



    public void setZeroTurnRadius(boolean zeroTurnRadius) {
        this.zeroTurnRadius = zeroTurnRadius;
    }



	public String toString() {
		return (super.toString() + "\n" + operatingHours + "\n" + zeroTurnRadius);
	}
	

}

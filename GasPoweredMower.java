
public class GasPoweredMower extends WalkBehindMower{
	
	private Engine engine;
	private boolean selfPropelled;
	
	public GasPoweredMower()
	{
		engine = null;
		selfPropelled = false;
	}
	
	GasPoweredMower(String manufacturer, int year, String serialNumber, String type,
            double wheelDiameter, double cutWidth, Engine engine, boolean selfPropelled)
    {
        super(manufacturer, year, serialNumber,type,wheelDiameter, cutWidth);
		this.selfPropelled = selfPropelled;
		this.engine = engine;
	}
	
	
	public Engine getEngine() {
		return engine;
	}



	public void setEngine(Engine engine) {
		this.engine = engine;
	}



	public boolean isSelfPropelled() {
		return selfPropelled;
	}



	public void setSelfPropelled(boolean selfPropelled) {
		this.selfPropelled = selfPropelled;
	}



	public String toString() {
		return (super.toString() + "\n" + engine + "\n" + selfPropelled);
	}
}

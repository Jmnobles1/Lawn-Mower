
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class MowerWareHouse {
	
	private String storeName;
    private ArrayList<Mower> mowers;

    public MowerWareHouse()
	{
        mowers = new ArrayList<Mower>();
		storeName = "None";
	}

	public String getStoreName() {
		return storeName;
	}

	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}

	public ArrayList<Mower> getMowers() {
		return mowers;
	}

	public  void setMowers(ArrayList<Mower> mowers) {
		this.mowers = mowers;
	}
	
	
    public void readMowerData(String string) throws IOException {
        FileInputStream fip = new FileInputStream(string);
	    Scanner scan = new Scanner(fip);
	    MowerWareHouse mw = new MowerWareHouse();
	    String wareHouseName = scan.nextLine();
	    
	    mw.setStoreName(wareHouseName);
	    mw.setMowers(mowers);
	    
		while (scan.hasNextLine())
		{
		    String manufacturer = scan.nextLine();
			int year = Integer.parseInt(scan.nextLine());
			String serialNumber = scan.nextLine();
			
			switch (scan.nextLine()) 
			{
			    case "L":
			        LawnTractor Tractor = new LawnTractor();
	                Tractor.setManufacturer(manufacturer);
	                Tractor.setYear(year);
	                Tractor.setSerialNumber(serialNumber); 
	                Tractor.setType("L");
	                Engine engine = new Engine();
	                engine.setManufacturer(scan.nextLine());
	                engine.setHorsePower(Double.parseDouble(scan.nextLine()));
	                engine.setCylinders(Integer.parseInt(scan.nextLine()));
	                Tractor.setEngine(engine);
	                Tractor.setModel(scan.nextLine());
	                Tractor.setDeckWidth(Double.parseDouble(scan.nextLine()));
	                   
	                mowers.add(Tractor);
	                
	                break;
			    
			  
			    case "C":
			        CommercialMower CM = new CommercialMower();
	                CM.setManufacturer(manufacturer);
	                CM.setYear(year);
	                CM.setSerialNumber(serialNumber);
	                CM.setType("C");
                    Engine engine1 = new Engine();
                    engine1.setManufacturer(scan.nextLine());
                    engine1.setHorsePower(Double.parseDouble(scan.nextLine()));
                    engine1.setCylinders(Integer.parseInt(scan.nextLine()));
                    CM.setEngine(engine1);
                    CM.setModel(scan.nextLine());
                    CM.setDeckWidth(Double.parseDouble(scan.nextLine())); 
                    CM.setOperatingHours(Double.parseDouble(scan.nextLine()));
                    CM.setZeroTurnRadius(Boolean.parseBoolean(scan.nextLine()));
	                
	                mowers.add(CM);
	                
	               
	                break;
                   
               
			
			    case "G":
			        GasPoweredMower GPM = new GasPoweredMower();
                    GPM.setManufacturer(manufacturer);
                    GPM.setYear(year);
                    GPM.setSerialNumber(serialNumber);
                    GPM.setType("G");
                    GPM.setCutWidth(Double.parseDouble(scan.nextLine()));
                    GPM.setWheelDiameter(Double.parseDouble(scan.nextLine()));
                    Engine engine2 = new Engine();
                    engine2.setManufacturer(scan.nextLine());
                    engine2.setHorsePower(Double.parseDouble(scan.nextLine()));
                    engine2.setCylinders(Integer.parseInt(scan.nextLine()));
                 
                    GPM.setEngine(engine2);
                    GPM.setSelfPropelled(Boolean.parseBoolean(scan.nextLine()));
                    
                    mowers.add(GPM);
                    
                    break;
			
			    case "P":
			        PushReelMower PRM = new PushReelMower();
                    PRM.setManufacturer(manufacturer);
                    PRM.setYear(year);
                    PRM.setSerialNumber(serialNumber);
                    PRM.setType("P");
                    PRM.setCutWidth(Double.parseDouble(scan.nextLine()));
                    PRM.setWheelDiameter(Double.parseDouble(scan.nextLine()));
                    PRM.setNumWheels(Integer.parseInt(scan.nextLine()));
                    
                    
                    mowers.add(PRM);
                    
                    
                    break;
			}
		}
			System.out.println("Enter your choice of Mower to get information.");
			System.out.println("Type C for Commerical Mower, G for Gas Powered Mower, P for Push reel Mower, L for Lawn Tractor, and S to stop");
			Scanner scanner = new Scanner(System.in);
			String input = scanner.nextLine();
			ArrayList<Mower> ml = new ArrayList<Mower>();
			mw.setMowers(ml);
			
			while (input.equals("S") == false)
			{
			    for(int i = 0; i < mowers.size(); i ++)
			    {
			        if(input.equals("C"))
			        {
			            if(mowers.get(i).getType().equals(input))
			            {
			                String c = mowers.get(i).getManufacturer() + "," + mowers.get(i).getYear() + "," + mowers.get(i).getSerialNumber() + "," +  mowers.get(i).getType()+ "," + ((CommercialMower)mowers.get(i)).getEngine().getManufacturer() + ","+
			                ((CommercialMower)mowers.get(i)).getEngine().getHorsePower() + "," + ((CommercialMower)mowers.get(i)).getEngine().getCylinders() + "," + ((CommercialMower)mowers.get(i)).getModel() + "," + ((CommercialMower)mowers.get(i)).getDeckWidth() + "," +
			                ((CommercialMower)mowers.get(i)).getOperatingHours() + "," + ((CommercialMower)mowers.get(i)).isZeroTurnRadius();
			                System.out.println(c);
			                CommercialMower CM = new CommercialMower();
                            CM.setManufacturer(mowers.get(i).getManufacturer());
                            CM.setYear(mowers.get(i).getYear());
                            CM.setSerialNumber(mowers.get(i).getSerialNumber());
                            CM.setType(mowers.get(i).getType());
                            Engine engine1 = new Engine();
                            engine1.setManufacturer(((CommercialMower)mowers.get(i)).getEngine().getManufacturer());
                            engine1.setHorsePower(((CommercialMower)mowers.get(i)).getEngine().getHorsePower());
                            engine1.setCylinders(((CommercialMower)mowers.get(i)).getEngine().getCylinders());
                            CM.setEngine(engine1);
                            CM.setModel(((CommercialMower)mowers.get(i)).getModel());
                            CM.setDeckWidth(((CommercialMower)mowers.get(i)).getDeckWidth()); 
                            CM.setOperatingHours(((CommercialMower)mowers.get(i)).getOperatingHours());
                            CM.setZeroTurnRadius(((CommercialMower)mowers.get(i)).isZeroTurnRadius());
                            
                            
                            ml.add(CM);
			                
		                       
			                        
			            }
			        }
			        else if(input.equals("L"))
                    {
                        if(mowers.get(i).getType().equals(input))
                        {
                            String l = mowers.get(i).getManufacturer() + "," + mowers.get(i).getYear() + "," + mowers.get(i).getSerialNumber() + "," + mowers.get(i).getType() + "," + ((LawnTractor)mowers.get(i)).getEngine().getManufacturer() + ","+
                                    ((LawnTractor)mowers.get(i)).getEngine().getHorsePower() + "," + ((LawnTractor)mowers.get(i)).getEngine().getCylinders() + "," + ((LawnTractor)mowers.get(i)).getModel() + "," + ((LawnTractor)mowers.get(i)).getDeckWidth();
                                    System.out.println(l);
                                    LawnTractor Tractor = new LawnTractor();
                                    Tractor.setManufacturer(mowers.get(i).getManufacturer());
                                    Tractor.setYear(mowers.get(i).getYear());
                                    Tractor.setSerialNumber(mowers.get(i).getSerialNumber());
                                    Tractor.setType(mowers.get(i).getType());
                                    Engine engine = new Engine();
                                    engine.setManufacturer(((LawnTractor)mowers.get(i)).getEngine().getManufacturer());
                                    engine.setHorsePower(((LawnTractor)mowers.get(i)).getEngine().getHorsePower());
                                    engine.setCylinders(((LawnTractor)mowers.get(i)).getEngine().getCylinders());
                                    Tractor.setEngine(engine);
                                    Tractor.setModel(((LawnTractor)mowers.get(i)).getModel());
                                    Tractor.setDeckWidth(((LawnTractor)mowers.get(i)).getDeckWidth()); 
                                    
                                    
                                    
                                    ml.add(Tractor);
                        }
                    }
			        else if(input.equals("G"))
                    {
                        if(mowers.get(i).getType().equals(input))
                        {
                            String g = mowers.get(i).getManufacturer() + "," + mowers.get(i).getYear() + "," + mowers.get(i).getSerialNumber() + "," + mowers.get(i).getType() + "," +((WalkBehindMower)mowers.get(i)).getCutWidth()+ "," + ((WalkBehindMower)mowers.get(i)).getWheelDiameter() + "," + ((GasPoweredMower)mowers.get(i)).getEngine().getManufacturer() + ","+
                                    ((GasPoweredMower)mowers.get(i)).getEngine().getHorsePower() + "," + ((GasPoweredMower)mowers.get(i)).getEngine().getCylinders() + "," + ((GasPoweredMower)mowers.get(i)).isSelfPropelled();
                                    System.out.println(g);
                                    GasPoweredMower GPM = new GasPoweredMower();
                                    GPM.setManufacturer(mowers.get(i).getManufacturer());
                                    GPM.setYear(mowers.get(i).getYear());
                                    GPM.setSerialNumber(mowers.get(i).getSerialNumber());
                                    GPM.setType(mowers.get(i).getType());
                                    GPM.setCutWidth(((WalkBehindMower)mowers.get(i)).getCutWidth());
                                    GPM.setWheelDiameter(((WalkBehindMower)mowers.get(i)).getWheelDiameter());
                                    Engine engine = new Engine();
                                    engine.setManufacturer(((GasPoweredMower)mowers.get(i)).getEngine().getManufacturer());
                                    engine.setHorsePower(((GasPoweredMower)mowers.get(i)).getEngine().getHorsePower());
                                    engine.setCylinders(((GasPoweredMower)mowers.get(i)).getEngine().getCylinders());
                                    GPM.setEngine(engine);
                                    GPM.setSelfPropelled(((GasPoweredMower)mowers.get(i)).isSelfPropelled());
                                    
                                    
                                    
                                    ml.add(GPM);
                        }
                    }
			        else if(input.equals("P"))
                    {
                        if(mowers.get(i).getType().equals(input))
                        {
                            String p = mowers.get(i).getManufacturer() + "," + mowers.get(i).getYear() + "," + mowers.get(i).getSerialNumber() + "," + mowers.get(i).getType()+ "," +((WalkBehindMower)mowers.get(i)).getCutWidth()+ "," + ((WalkBehindMower)mowers.get(i)).getWheelDiameter() + "," +
                                    ((PushReelMower)mowers.get(i)).getNumWheels();
                                    System.out.println(p);
                                    PushReelMower PRM = new PushReelMower();
                                    PRM.setManufacturer(mowers.get(i).getManufacturer());
                                    PRM.setYear(mowers.get(i).getYear());
                                    PRM.setSerialNumber(mowers.get(i).getSerialNumber());
                                    PRM.setType(mowers.get(i).getType());
                                    PRM.setCutWidth(((WalkBehindMower)mowers.get(i)).getCutWidth());
                                    PRM.setWheelDiameter(((WalkBehindMower)mowers.get(i)).getWheelDiameter());
                                    PRM.setNumWheels(((PushReelMower)mowers.get(i)).getNumWheels());
                                    
                                    
                                    
                                    ml.add(PRM);
                            
                            
                        }
                    }
			        else if(!input.equals("C") || !input.equals("G") || !input.equals("P") || !input.equals("L") || !input.equals("S"))
			        {
			            System.exit(0);
			        }
			    }
	            System.out.println("Type C for Commerical Mower, G for Gas Powered Mower, P for Push reel Mower, L for Lawn Tractor, and S to stop");
                input = scanner.nextLine();    
			
			}
			Scanner scnr = new Scanner(System.in);
			System.out.println("Enter the file you want to save your information to");
			String input2 = scnr.next();
			mw.saveMowerData(input2);
			
			scan.close();
			scnr.close();
			
			
		
	}
		
	public void saveMowerData(String output) throws IOException {
        FileOutputStream fo = new FileOutputStream(output);
        PrintWriter p = new PrintWriter(fo);
        p.println(storeName);
        for (int i = 0; i < mowers.size(); i ++)
        {
            p.println(mowers.get(i));
        }
        p.close();
	}
	    
	    
	
	public String toString() {
		return (storeName + "\n" + mowers.toString()) ;
	}
}

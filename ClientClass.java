import java.io.*;
import java.util.*;

import javax.swing.JFileChooser;
import javax.swing.JFrame;

public class ClientClass {

	public static void main(String[] args) throws IOException {
	    if (args.length <= 1) {
	        MowerWareHouse mw = new MowerWareHouse();
	        
	        
	        JFileChooser jfc = new JFileChooser();
	        int r = jfc.showOpenDialog(new JFrame());
	        
	        
	        if (r == JFileChooser.APPROVE_OPTION)
	        {
	            File select = jfc.getSelectedFile();
	            String string = select.toString();
	            mw.readMowerData(string);
	            
	        }
	        
	    }
	    else if (args[0] == null){
	        throw new NullPointerException();
	    }
	    
	    
	  
	}
	
}
	

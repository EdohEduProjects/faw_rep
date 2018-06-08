/*
 * This is generated code, copyright free and unrestricted
 */
package bj.armyworm.mobile.webservicesproxy.data;

import com.codename1.io.Externalizable;
import bj.armyworm.data.*;
import model.famer;

public class FawDataServer {
    public static boolean createPestRecord(String[] newpest) {
        // your code goes here...
    	
    	Farmer _farmer = new Farmer();
    	famer f = new famer();
    	f.setAddr("aa");
    	
    	_farmer.CreateAFarmer(f)
        return false;
    }

    public static boolean readPestRecord(int farmerId) {
        // your code goes here...
        return false;
    }

    public static boolean updatePestRecord(String[] newRecordElements) {
        // your code goes here...
        return false;
    }

    public static boolean deletePestRecord(int farmerId) {
        // your code goes here...
        return false;
    }

}

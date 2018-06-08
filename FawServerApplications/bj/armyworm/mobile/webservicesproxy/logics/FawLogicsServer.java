/*
 * This is generated code, copyright free and unrestricted
 */
package bj.armyworm.mobile.webservicesproxy.logics;

import com.codename1.io.Externalizable;
import bj.armyworm.services.learning.*;


public class FawLogicsServer {
	String _traingfile = "\\path";
	string _evaluationfile ;
	
    public static boolean ClassifyPest(String pictureUrl) {
    	this._evaluationfile = pictureUrl;
        // call classifypests service
    	ClassifyPests cl = new ClassifyPests();
    	//Check if the pest belongs to the said pest's class
    	cl.MLPCPestClassifier(_trainingfile, _evaluationfile)
        return false;
    }

}

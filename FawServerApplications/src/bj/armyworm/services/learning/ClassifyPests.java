/**
 * 
 */
package bj.armyworm.services.learning;

import javax.jws.WebService;

/**
 * @author Thierry Edoh
 *
 */
@WebService
public class ClassifyPests implements Iclassifier {

	/**
	 * 
	 */
	public ClassifyPests() {
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see bj.armyworm.web.IpestRecognition#MLPCPestClassifier(java.lang.String, java.lang.String)
	 */
	@Override
	public boolean MLPCPestClassifier(String trainingfile, String evaluationfile) {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see bj.armyworm.web.IpestRecognition#UpdateTrainingFile(java.lang.String, java.lang.String)
	 */
	@Override
	public String UpdateTrainingFile(String oldtraingfile, String newImage) {
		// TODO Auto-generated method stub
		return null;
	}
	/**
	 * 
	 * @param Pclass is the class of the pests, example Cat, insect.
	 * @return
	 */
	public String ClassifyAPest(String Pclass) {
		return null;
	}

}

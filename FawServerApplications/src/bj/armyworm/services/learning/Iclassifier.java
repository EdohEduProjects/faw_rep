/**
 * 
 */
package bj.armyworm.services.learning;

/**
 * @author Thierry Edoh
 *
 */
public interface Iclassifier {

	/**
	 * @param trainingfile   the training file
	 * @param evaluationfile the evaluation file
	 * @return true or false
	 */
	public boolean MLPCPestClassifier(String trainingfile, String evaluationfile);
	
	/**
	 * 
	 * @param oldtraingfile
	 * @param newImage 
	 * @return the new file
	 */
	public String UpdateTrainingFile(String oldtraingfile, String newImage);
}

/**
 * 
 */
package bj.armyworm.data;

import java.util.List;

import model.famer;

/**
 * @author Thierry Edoh
 *
 */
public interface Ifamer {
	/*
	 * Create a farmer 
	 */
	public String CreateAFarmer(famer famer);
	/*
	 * Delete a farmer
	 */
	public String DeleteAFarmer(famer famer);
	/*
	 * Update a farmer 
	 */
	public String UpadateAFarmer(famer famer);
	/*
	 * Select a farmer from the database
	 */
	public List<String> ReadFarmerAttributes(famer famer);
	

}

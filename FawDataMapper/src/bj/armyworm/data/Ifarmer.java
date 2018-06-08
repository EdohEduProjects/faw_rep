/**
 * 
 */
package bj.armyworm.data;

import java.util.List;

import model.Farmer;

/**
 * @author Thierry Edoh
 *
 */
public interface Ifarmer {
	/*
	 * Create a farmer 
	 */
	public String CreateAFarmer(Farmer famer);
	/*
	 * Delete a farmer
	 */
	public String DeleteAFarmer(int id);
	/*
	 * Update a farmer 
	 */
	public String UpadateAFarmer(Farmer famer, String old_id);
	/*
	 * Select a farmer from the database
	 */
	public List<String> ReadFarmerAttributes(int id);
	

}

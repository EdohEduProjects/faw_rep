/**
 * 
 */
package bj.armyworm.users;

/**
 * @author Thierry Edoh
 *
 */
public interface ImanageUserRoles {
	
	//Create a role
public String Setrole (int personid);
public String Setrole(String ...personnames);

//Read a role
public String Selectrole (int personid);
public String Selectrole(String ...personnames);

//Update a role

public String Updaterole (int personid);
public String Updaterole(String ...personnames);

//Delete
public String Deleterole (int personid);
public String Deleterole(String ...personnames);


}

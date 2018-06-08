/**
 * 
 */
package bj.armyworm.data;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import org.eclipse.persistence.exceptions.DBWSException;
import model.Farmer;
/**
 * @author Thierry Edoh
 *
 */
public class Farmers implements Ifarmer{

	EntityManagerFactory emf;
	EntityManager em;
	String returnMessage;
	List <String> returnlist ;
	
public void Famer() {
	// create entity manager factory
		this.emf = Persistence.createEntityManagerFactory("");
	    this.em = emf.createEntityManager();
}

@Override
public String CreateAFarmer(Farmer _farmer) {
	
	try {
		 // start transaction
	    this.em.getTransaction().begin();
	    this.em.persist(_farmer);
	    this.em.getTransaction().commit();
	}
	catch(DBWSException dbe){
		this.returnMessage = dbe.getMessage();
	}
	finally {
		this.em.close();
		this.emf.close();
		this.returnMessage = _farmer+" is successfully created.";
	}
	return this.returnMessage;
}

@Override
public String DeleteAFarmer(int id) {
	
	try {
		 // start transaction
	    this.em.getTransaction().begin();
Farmer fa = (Farmer) this.em.find(Farmer.class, id);
	    returnMessage = fa.getFarmerlastname();
	    this.em.remove(fa);
	    this.em.getTransaction().commit();
	}
	catch(DBWSException dbe){
		this.returnMessage = dbe.getMessage();
	}
	finally {
		this.em.close();
		this.emf.close();
		this.returnMessage = returnMessage+" is successfully removed.";
	}
	return this.returnMessage;
}

@Override
public String UpadateAFarmer(Farmer _farmer, String old_id) {
	
	try {
		 // start transaction
	    this.em.getTransaction().begin();
	   Farmer fa = this.em.find(Farmer.class, old_id);
	    returnMessage = "Old last name: "+fa.getFarmerlastname()+ "New last name: "+_farmer.getFarmerlastname();
	    if(_farmer.getAddr() != fa.getAddr()) {
	    	 returnMessage = returnMessage+"\n Old addr: "+fa.getAddr()+ "New addr: "+_farmer.getAddr();
	    	 	fa.setAddr(_farmer.getAddr());
	    	}
	    
	    if(_farmer.getFarmerlastname() != fa.getFarmerlastname()) {
	    	 returnMessage = returnMessage+"\n Old last name: "+fa.getFarmerlastname()+ "New last name: "+_farmer.getFarmerlastname();
	    	 	fa.setFarmerlastname(_farmer.getFarmerlastname());
	    	}
	    
	    if(_farmer.getId() != fa.getId()) {
	    	 returnMessage = returnMessage+"\n Old ID: "+fa.getId()+ "New ID: "+_farmer.getId();
	    	 	fa.setId(_farmer.getId());
	    	}
	    
	    if(_farmer.getFarmername() != fa.getFarmername()) {
	    	 returnMessage =returnMessage+ "\n Old last name: "+fa.getFarmername()+ "New last name: "+_farmer.getFarmername();
	    	 	fa.setFarmername(_farmer.getFarmername());
	    }
	    this.em.getTransaction().commit();
	}
	catch(DBWSException dbe){
		this.returnMessage = dbe.getMessage();
	}
	finally {
		this.em.close();
		this.emf.close();
		this.returnMessage = " Update successful"+"\n"+returnMessage;
	}
	return this.returnMessage;
}

@Override
public List<String> ReadFarmerAttributes(int id) {
	returnlist = new ArrayList<String>();
	try {
		 // start transaction
	    Farmer fa = this.em.find(Farmer.class, id);
	    returnlist.add(fa.getId().toString());
	    returnlist.add(fa.getFarmername());
	    returnlist.add(fa.getFarmerlastname());
	    returnlist.add(fa.getAddr());
	    this.em.getTransaction().commit();
	}
	catch(DBWSException dbe){
		this.returnMessage = dbe.getMessage();
	}
	finally {
		this.em.close();
		this.emf.close();
	}
	return this.returnlist;
}



}

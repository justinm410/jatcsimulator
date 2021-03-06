package atc;

import java.io.Serializable;

/**
 * The user interface defines the functionality that any User must have.
 * @author jminer2
 *
 */
public interface User extends Serializable {

	public void setUserName(String userName);
	
	public String getUserName();
	
	public void setPassword(String password);
	
	public String getPassword();
	
	public void hasAdminAccess(boolean hasAccess);
	
	public boolean checkAdminAccess();
	
	public void setFName(String fname);
	
	public String getFName();
	
	public void setLName(String lname);
	
	public String getLName();
	
	public void setAddress(String addr);
	
	public String getAddress();
}

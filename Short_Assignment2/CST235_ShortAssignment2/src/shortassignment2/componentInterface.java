//Mark Piland
//CST 235
//2/20/18
//websites used
//https://www.lynda.com/Java-tutorials/Creating-component-interface/170059/189096-4.html
package shortassignment2;

import java.rmi.RemoteException;

public interface componentInterface extends javax.ejb.EJBLocalObject {

	public double getVideo_length() throws RemoteException;
	
}


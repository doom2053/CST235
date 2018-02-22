//Mark Piland
//CST 235
//2/20/18
//websites used
//https://www.lynda.com/Java-tutorials/Creating-home-interface/170059/189095-4.html
package shortassignment2;
import javax.ejb.EJBHome;
import shortassignment2.videoCalc;
import javax.ejb.CreateException;
import java.rmi.RemoteException;
public interface homeInterface extends EJBHome
{
public videoCalc create() throws CreateException, RemoteException;
}

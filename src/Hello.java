import java.rmi.*;
 
public interface Hello extends Remote {
   public double hello(double a, double  b,  double c) throws RemoteException;
} // double a, double  b,  double c

import java.io.IOException;
import java.io.NotSerializableException;
import java.io.WriteAbortedException;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.server.ServerNotActiveException;


public interface InterfaceRemota extends Remote
{
    public double iniMonitor () throws RemoteException, IOException,WriteAbortedException, NotSerializableException;
    public void loadMonitor (String VarSectP) throws RemoteException;
    public int iniClient () throws RemoteException,IOException,WriteAbortedException, NotSerializableException,ServerNotActiveException;
    public String getLoadAvg () throws RemoteException;
}

package Common;

import java.rmi.RemoteException;

public class KundeException extends RemoteException {
    public KundeException(String msg){
        super(msg);
    }
}

package Server.Finanzamt;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface Finanzamt extends Remote {
    /**
     * Die Summe aller Konten bei einer Band
     * @param name
     * @return
     */
    Double getSum(String name) throws RemoteException;

    /**
     * Die Kontonummer des Kunden bei einer Bank
     * @param name
     * @return
     */
    List<Long> getKontoNummern(String name) throws RemoteException;

}

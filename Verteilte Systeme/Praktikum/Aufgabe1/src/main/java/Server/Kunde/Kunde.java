package Server.Kunde;
import java.rmi.Remote;
import java.rmi.RemoteException;
import Common.Kontostand;
import Common.KundeException;

public interface Kunde extends Remote {
    /**
     * Neues Konto mit Parametern Rückgabe ist die Kontonummer
     * Kontostand auf 0.00f
     * @param name
     * @param password
     */
    void newKonto(String name, String password) throws RemoteException;

    /**
     * Einzahlen mit Parametern, Rückgabe, ob erfolgreich, sonst Exception
     * @param ktnNummer
     * @param name
     * @param value
     * @return erfolgreich
     * @throws KundeException
     */
    void newDeposit(Long ktnNummer, String name, double value) throws RemoteException;

    /**
     * Einzahlung mit Parametern
     *
     * @param ktnNummer
     * @param name
     * @param passwort
     * @param value
     * @throws KundeException,
     */
    void withDraw(Long ktnNummer, String name, String passwort, double value) throws RemoteException;

    /**
     * Kontostand erhalten als serilisierbares Objekt
     * @param ktnNummer
     * @param name
     * @param password
     * @return
     * @throws KundeException
     */
    Kontostand getKontoStand(long ktnNummer, String name, String password) throws RemoteException;
}

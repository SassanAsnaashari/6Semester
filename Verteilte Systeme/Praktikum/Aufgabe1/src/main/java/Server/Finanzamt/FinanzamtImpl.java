package Server.Finanzamt;

import java.rmi.RemoteException;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import Common.Konto;
import Common.KundeException;
import Server.BankServer;

public class FinanzamtImpl extends UnicastRemoteObject implements  Finanzamt{

    private Map<Long, Konto> kontoList = BankServer.getKontoListen();

    public FinanzamtImpl(String name, Registry reg) throws RemoteException {
        try {
            reg.rebind(name, this);
        }catch (Exception e){
            System.out.println("Exception " + e.getMessage());
        }
    }


    @Override
    public Double getSum(final String name) throws RemoteException {
        List<Konto> konten = kontoList.values().stream()
                                            .filter(konto -> konto.getName().equals(name))
                                            .collect(Collectors.toList());
        return konten.stream().mapToDouble(k -> k.getKontostand().getKontostand()).sum();
    }


    @Override
    public List<Long> getKontoNummern(final String name) throws RemoteException{
        return kontoList.values().stream().filter(k -> k.getName().equals(name)).map(Konto::getKontoNummer).collect(Collectors.toList());
    }
}

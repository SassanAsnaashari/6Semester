package Server.Kunde;

import java.rmi.RemoteException;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;
import java.util.Map;
import java.util.Random;
import Common.Konto;
import Common.Kontostand;
import Common.KundeException;
import Server.BankServer;

public class KundeImpl extends UnicastRemoteObject implements Kunde{

    private Map<Long, Konto> kontoList = BankServer.getKontoListen();



    public KundeImpl(String name, Registry reg) throws RemoteException {
        super();
        try {
            reg.rebind(name, this);
        } catch (Exception e) {
            System.out.println("Exception " + e.getMessage());
        }
    }


    public void newKonto(final String name, final String password) {
        long kontoNummer = BankServer.generateNr();
        Konto konto = new Konto(kontoNummer, name, password);
        kontoList.put(kontoNummer,konto);
        kontoList.values().forEach(System.out::println);
        System.out.println("****************************");
    }

    @Override
    public void newDeposit(final Long ktnNummer, final String name, final double value) throws KundeException {
        if (!kontoList.containsKey(ktnNummer)) throw new KundeException("Konto nicht angelegt");
        Konto konto = kontoList.get(ktnNummer);
        if(!konto.getName().equals(name)) throw  new KundeException("Falscher Name");
        konto.getKontostand().setKontostand(konto.getKontostand().getKontostand() + value);
        kontoList.values().forEach(System.out::println);
        System.out.println("****************************");
    }


    @Override
    public void withDraw(final Long ktnNummer, final String name, final String passwort, final double value) throws KundeException {
        if(!kontoList.containsKey(ktnNummer)) throw new KundeException("Konto nicht angelegt");
        Konto konto = kontoList.get(ktnNummer);
        if(!konto.getName().equals(name)) throw new KundeException("Falscher Name");
        else if(!konto.getPassword().equals(passwort)) throw new KundeException("Falsches Passwort");
        else if(konto.getKontostand().getKontostand() - value < 0.0) throw new KundeException("Konto nicht gedeckt");
        konto.getKontostand().setKontostand(konto.getKontostand().getKontostand() - value);
        kontoList.values().forEach(System.out::println);
        System.out.println("****************************");
    }

    @Override
    public Kontostand getKontoStand(final long ktnNummer, final String name, final String password) throws KundeException {
        if(!kontoList.containsKey(ktnNummer)) throw new KundeException("Kontonummer nicht vorhanden");
        else if(!kontoList.get(ktnNummer).getName().equals(name)) throw new KundeException("Name falsch");
        else if(!kontoList.get(ktnNummer).getPassword().equals(password)) throw new KundeException("falsches Password");
        return kontoList.get(ktnNummer).getKontostand();
    }


}

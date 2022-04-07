package Client;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;
import Common.Kontostand;
import Server.Kunde.Kunde;

public class KundeClient {
    public static void main(String[] args) {
        try{

            Scanner     scanner         = new Scanner(System.in);
            System.out.println("Waehlen Sie den Server");
            int port = scanner.nextInt();
            System.out.println("Waehlen Sie die Bank");
            String bank = scanner.next();
            Registry    registry        = LocateRegistry.getRegistry(port);
            Kunde       kunde           = (Kunde) registry.lookup(bank);

            long        ktnummer        = 0L;
            double      value           = 0.0;
            String      pwd;
            while (true){

                System.out.println("Menu");
                System.out.println("(1) neues Konto");
                System.out.println("(2) Einzahlung");
                System.out.println("(3) Auszahlung");
                System.out.println("(4) Kontostand");
                System.out.println("(5) Bank wechseln");
                System.out.println("(6) EXIT");

                switch (scanner.nextInt()){
                    case(1):
                        System.out.println("Name:");
                        String name = scanner.next();
                        System.out.println("Pasword:");
                        pwd = scanner.next();
                        kunde.newKonto(name,pwd);
                        break;
                    case(2):
                        System.out.println("Kontonummer:");
                        ktnummer = scanner.nextLong();
                        System.out.println("Name:");
                        name = scanner.next();
                        System.out.println("Wert:");
                        value = scanner.nextDouble();
                        kunde.newDeposit(ktnummer,name,value);
                        break;
                    case(3):
                        System.out.println("Kontonummer:");
                        ktnummer = scanner.nextLong();
                        System.out.println("Name:");
                        name = scanner.next();
                        System.out.println("Wert:");
                        value = scanner.nextDouble();
                        System.out.println("Password:");
                        pwd = scanner.next();
                        kunde.withDraw(ktnummer,name,pwd,value);
                        break;
                    case(4):
                        System.out.println("Kontonummer:");
                        ktnummer = scanner.nextLong();
                        System.out.println("Name:");
                        name = scanner.next();
                        System.out.println("Password");
                        pwd = scanner.next();
                        Kontostand kontostand = kunde.getKontoStand(ktnummer,name,pwd);
                        System.out.println(kontostand);
                        break;
                    case(5):
                        System.out.println("Waehlen Sie den Server");
                        port = scanner.nextInt();
                        System.out.println("Waehlen Sie die Bank");
                        bank = scanner.next();
                        registry        = LocateRegistry.getRegistry(port);
                        kunde           = (Kunde) registry.lookup(bank);
                        break;
                    case(6):
                        scanner.close();
                        return;
                    default:
                        System.out.println("Wrong input");
                }

            }

        } catch (RemoteException e) {
            System.out.println("Kunden Exception " + e.getMessage());
        } catch (NotBoundException e) {
            e.printStackTrace();
        }
    }


}

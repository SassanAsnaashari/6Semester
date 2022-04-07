package Client;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;
import Server.Finanzamt.Finanzamt;
import Server.Kunde.Kunde;

public class FinanzamtClient {
    public static void main(String[] args) {
        try {
            Scanner     scanner     = new Scanner(System.in);
            String      name;
            int         choose;
            System.out.println("Waehlen Sie den Server");
            int port = scanner.nextInt();
            System.out.println("Waehlen Sie die Bank");
            String bank = scanner.next();
            Registry    registry        = LocateRegistry.getRegistry(port);
            Finanzamt   amt         = (Finanzamt) registry.lookup(bank);

            while(true){
                System.out.println("***************************************");
                System.out.println("Menu");
                System.out.println("(1) Summierter Kontostand");
                System.out.println("(2) alle Kontonummern des Kunden");
                System.out.println("(3) Bank wechseln");
                System.out.println("(4) Exit");
                choose = scanner.nextInt();
                switch (choose){
                    case 1:
                        System.out.println("Name");
                        name = scanner.next();
                        System.out.println(amt.getSum(name));
                        break;
                    case 2:
                        System.out.println("Name");
                        name = scanner.next();
                        amt.getKontoNummern(name).forEach(System.out::println);
                        break;
                    case 3:
                        System.out.println("Waehlen Sie den Server");
                        port = scanner.nextInt();
                        System.out.println("Waehlen Sie die Bank");
                        bank = scanner.next();
                        registry        = LocateRegistry.getRegistry(port);
                        amt             = (Finanzamt) registry.lookup(bank);
                        break;
                    case 4:
                        return;
                    default:
                        System.out.println("Wrong input");

                }
                System.out.println("***************************************");
            }
        } catch (RemoteException e) {
            System.out.println("Wrong Socket");
        } catch (NotBoundException e) {
            e.printStackTrace();
        }
    }

}

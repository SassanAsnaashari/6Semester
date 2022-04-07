package Server;

import java.rmi.registry.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import Common.Konto;
import Server.Finanzamt.FinanzamtImpl;
import Server.Kunde.KundeImpl;

public class BankServer {
    private static Map<Long, Konto> kontoListen =  new HashMap<>();


    public static Map<Long, Konto> getKontoListen() {
        return kontoListen;
    }

    public static void init(){
        for(int k = 0 ; k < 3 ; k++){
            long kontoNr = generateNr();
            kontoListen.put(kontoNr, new Konto(kontoNr, "Sassan",generateString()) );
        }
        for(int k = 0 ; k < 3 ; k++){
            long kontoNr = generateNr();
            kontoListen.put(kontoNr, new Konto(kontoNr, "Horst",generateString()) );
        }
        for(int k = 0 ; k < 3 ; k++){
            long kontoNr = generateNr();
            kontoListen.put(kontoNr, new Konto(kontoNr, "Peter",generateString()) );
        }
        System.out.println(kontoListen);
    }


    private static String generateString() {
        int leftLimit = 48; // numeral '0'
        int rightLimit = 122; // letter 'z'
        int targetStringLength = 10;
        Random random = new Random();
        String name = random.ints(leftLimit, rightLimit + 1)
                .filter(i -> (i <= 57 || i >= 65) && (i <= 90 || i >= 97))
                .limit(targetStringLength)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
        return name;
    }


    public static void main(String[] args) {
        //init();
        try{
            Registry        reg         = LocateRegistry.createRegistry(Integer.parseInt(args[2]));
            KundeImpl       kunde       = new KundeImpl(args[0] , reg);
            FinanzamtImpl   finanzamt   = new FinanzamtImpl(args[1], reg);
            System.out.println("Server is running with :" + "\n"  + args[0] + "\n" + args[1]+ "\n"  + args[2]);
        } catch (Exception e) {
            System.out.println("Server Exception" + e.getMessage());
        }
    }

    public static long generateNr() {
        long nummer = 1L;
        while(kontoListen.containsKey(nummer) || nummer < 0){
            nummer = new Random().nextLong();
        }
        return nummer;
    }
}

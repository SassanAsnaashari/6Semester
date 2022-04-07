package Common;

public class Konto {

    private Long        kontoNummer;
    private String      name;
    private String      password;
    private Kontostand  kontostand;


    public Konto(Long kontoNummer, String name, String password){
        this.kontoNummer = kontoNummer;
        this.name = name;
        this.password = password;
        this.kontostand = new Kontostand();
        this.kontostand.setKontonummer(kontoNummer);
    }
    public Long getKontoNummer() {
        return kontoNummer;
    }


    public void setKontoNummer(final Long kontoNummer) {
        this.kontoNummer = kontoNummer;
    }


    public String getName() {
        return name;
    }


    public void setName(final String name) {
        this.name = name;
    }


    public String getPassword() {
        return password;
    }


    public void setPassword(final String password) {
        this.password = password;
    }


    public Kontostand getKontostand() {
        return kontostand;
    }


    public void setKontostand(final Kontostand kontostand) {
        this.kontostand = kontostand;
    }


    @Override
    public String toString() {
        return "Konto{" +
                "kontoNummer=" + kontoNummer +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", kontostand=" + kontostand +
                '}';
    }


}

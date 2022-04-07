package Common;

import java.io.Serializable;
import java.rmi.*;

public class Kontostand implements Serializable {
    private double  m_Kontostand;
    private long    m_Kontonummer;

    public Kontostand(){
        this.m_Kontonummer  =   0L;
        this.m_Kontostand   =   0.0;
    }
    public Kontostand(double kontostand, long kontonummer){
        this.m_Kontostand   = kontostand;
        this.m_Kontonummer  = kontonummer;
    }


    public double getKontostand() {
        return m_Kontostand;
    }


    public void setKontostand(double m_Kontostand) {
        this.m_Kontostand = m_Kontostand;
    }


    public long getKontonummer() {
        return m_Kontonummer;
    }


    public void setKontonummer(long m_Kontonummer) {
        this.m_Kontonummer = m_Kontonummer;
    }


    @Override
    public String toString() {
        return  "Kontostand=" + m_Kontostand;
    }
}

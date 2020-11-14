package ba.unsa.etf.rpr;

import java.util.ArrayList;
import java.util.List;

public class Pitanje {
    String tekstPitanja;
    double brojPoena;
    List<Odgovor> odgovoriNaPitanja;

    Pitanje(String tekstPitanja, double brojPoena) {
        this.tekstPitanja=tekstPitanja;
        this.brojPoena=brojPoena;
        odgovoriNaPitanja=new ArrayList<Odgovor>();
    }
    public String getTekstPitanja() {
        return tekstPitanja;
    }

    public void setTekstPitanja(String tekstPitanja) {
        this.tekstPitanja = tekstPitanja;
    }

    public double getBrojPoena() {
        return brojPoena;
    }

    public void setBrojPoena(double brojPoena) {
        this.brojPoena = brojPoena;
    }

    public List<Odgovor> getOdgovoriNaPitanja() {
        return odgovoriNaPitanja;
    }

    public void setOdgovoriNaPitanja(List<Odgovor> odgovoriNaPitanja) {
        this.odgovoriNaPitanja = odgovoriNaPitanja;
    }
    public void dodajOdgovor(String id, String tekstOdgovora, boolean tacnost) {

    }
}

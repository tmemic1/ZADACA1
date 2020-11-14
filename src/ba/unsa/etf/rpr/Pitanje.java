package ba.unsa.etf.rpr;

import java.util.List;

public class Pitanje {
    String tekstPitanja;
    int brojPoena;
    List<Odgovor> odgovoriNaPitanja;

    public String getTekstPitanja() {
        return tekstPitanja;
    }

    public void setTekstPitanja(String tekstPitanja) {
        this.tekstPitanja = tekstPitanja;
    }

    public int getBrojPoena() {
        return brojPoena;
    }

    public void setBrojPoena(int brojPoena) {
        this.brojPoena = brojPoena;
    }

    public List<Odgovor> getOdgovoriNaPitanja() {
        return odgovoriNaPitanja;
    }

    public void setOdgovoriNaPitanja(List<Odgovor> odgovoriNaPitanja) {
        this.odgovoriNaPitanja = odgovoriNaPitanja;
    }
}

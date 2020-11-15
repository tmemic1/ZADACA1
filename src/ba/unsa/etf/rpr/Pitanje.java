package ba.unsa.etf.rpr;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Pitanje{
    String tekstPitanja;
    double brojPoena;
    List<Odgovor> odgovoriNaPitanja;

    Pitanje(String tekstPitanja, double brojPoena) {
        this.tekstPitanja=tekstPitanja;
        this.brojPoena=brojPoena;
        odgovoriNaPitanja=new ArrayList<Odgovor>();
    }
    public String getTekst() {
        return tekstPitanja;
    }

    public void setTekst(String tekstPitanja) {
        this.tekstPitanja = tekstPitanja;
    }

    public double getBrojPoena() {
        return brojPoena;
    }

    public void setBrojPoena(double brojPoena) {
        this.brojPoena = brojPoena;
    }

    public List<Odgovor> getOdgovori() {
        return odgovoriNaPitanja;
    }

    public void setOdgovoriNaPitanja(List<Odgovor> odgovoriNaPitanja) {
        this.odgovoriNaPitanja = odgovoriNaPitanja;
    }
    public void dodajOdgovor(String id1, String tekstOdgovora, boolean tacno) {
     Odgovor odg=new Odgovor(tekstOdgovora,tacno);
     odg.setId(id1);
     odgovoriNaPitanja.add(odg);
    }
    public void obrisiOdgovor(String idOdgovora) throws IllegalArgumentException {
        boolean obrisanJeOdgovor=false;
        for(int i=0; i<odgovoriNaPitanja.size(); i++) {
       if(odgovoriNaPitanja.get(i).id==idOdgovora) {
           odgovoriNaPitanja.remove(odgovoriNaPitanja.get(i));
           obrisanJeOdgovor=true;
            }
       }
        if(obrisanJeOdgovor==false)throw new IllegalArgumentException("Odgovor s ovim id-em ne postoji");
    }

    public List<Odgovor> dajListuOdgovora() {
        return odgovoriNaPitanja;
    }

    public double izracunajPoene(List<String> a, SistemBodovanja nacinBodovanja) {
      return 0;
    }
}

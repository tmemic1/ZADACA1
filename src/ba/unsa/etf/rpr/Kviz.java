package ba.unsa.etf.rpr;

import java.util.*;

public class Kviz {

    String naziv;
    List<Pitanje> pitanja;
    SistemBodovanja sistemBodovanja;
       Kviz(String nazivPitanja, SistemBodovanja sistem) {
           this.naziv=nazivPitanja;
           this.sistemBodovanja=sistem;
           pitanja=new ArrayList<Pitanje>(0);
       }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public List<Pitanje> getPitanja() {
        return pitanja;
    }

    public void setPitanja(List<Pitanje> pitanja) {
        this.pitanja = pitanja;
    }

    public SistemBodovanja getSistemBodovanja() {
        return sistemBodovanja;
    }

    public void setSistemBodovanja(SistemBodovanja sistemBodovanja) {
        this.sistemBodovanja = sistemBodovanja;
    }
    public void dodajPitanje(Pitanje pitanje) throws IllegalArgumentException {
           String poruka=pitanje.getTekstPitanja();
           Iterator it= pitanja.iterator();
           while(it.hasNext()) {
               Pitanje poruka1=(Pitanje) it;
             if(poruka==poruka1.getTekstPitanja()) throw new IllegalArgumentException("Ne možete dodati pitanje sa tekstom koji već postoji");
           }
           pitanja.add(pitanje);
    }

    public int predajKviz(Map<Pitanje, ArrayList<String>> zaokruzeniOdgovori) {
           return 0;
    }
}

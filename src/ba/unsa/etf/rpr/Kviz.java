package ba.unsa.etf.rpr;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

public class Kviz extends Pitanje {
       public enum SistemBodovanja{BINARNO, PARCIJALNO, PARCIJALNO_SA_NEGATIVNIM}
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
    public void dodajPitanje(Pitanje pitanje) {
        ListIterator<Pitanje> it= pitanja.listIterator();
        while(it!=pitanja.size()) {
            if(this.it.getTekstPitanja()==pitanje.getTekstPitanja())
                throw new IllegalArgumentException("Ne možete dodati pitanje sa tekstom koji već postoji");
            it++;
        }
           pitanja.add(pitanje);
    }
    public void toString() {

    }

}

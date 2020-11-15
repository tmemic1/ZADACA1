package ba.unsa.etf.rpr;

import java.util.*;

public class Kviz {

    String naziv;
    List<Pitanje> pitanja;
    SistemBodovanja sistemBodovanja;

    public Kviz(String moj_kviz, SistemBodovanja parcijalno) {
        naziv=moj_kviz;
        sistemBodovanja=parcijalno;
        pitanja=new ArrayList<>();
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
           if(pitanja.contains(pitanje)) throw new IllegalArgumentException("Ne možete dodati pitanje sa tekstom koji već postoji");
           pitanja.add(pitanje);
    }

    public RezultatKviza predajKviz(Map<Pitanje, ArrayList<String>> zaokruzeniOdgovori) {
        return null;
    }
}

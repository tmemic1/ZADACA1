package ba.unsa.etf.rpr;

public class Odgovor {
    String tekstOdgovora;
    String id;
    boolean Tacno;

    public Odgovor(String tekstOdgovora,boolean tacno) {
        this.tekstOdgovora = tekstOdgovora;
        Tacno = tacno;
    }
    public String getTekstOdgovora() {
        return tekstOdgovora;
    }

    public void setTekstOdgovora(String tekstOdgovora) {
        this.tekstOdgovora = tekstOdgovora;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean isTacno() {
        return Tacno;
    }

    public void setTacno(boolean tacno) {
        Tacno = tacno;
    }
}

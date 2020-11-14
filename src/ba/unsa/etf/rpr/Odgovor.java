package ba.unsa.etf.rpr;

public class Odgovor {
    String tekstOdgovora;
    boolean tacnostOdgovora;

    public Odgovor(String tekstOdgovora, boolean tacnostOdgovora) {
        this.tekstOdgovora = tekstOdgovora;
        this.tacnostOdgovora = tacnostOdgovora;
    }

    public String getTekstOdgovora() {
        return tekstOdgovora;
    }

    public void setTekstOdgovora(String tekstOdgovora) {
        this.tekstOdgovora = tekstOdgovora;
    }

    public boolean isTacnostOdgovora() {
        return tacnostOdgovora;
    }

    public void setTacnostOdgovora(boolean tacnostOdgovora) {
        this.tacnostOdgovora = tacnostOdgovora;
    }
}

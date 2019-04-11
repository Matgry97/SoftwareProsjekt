import java.time.LocalDate;
import java.util.ArrayList;

public class Film {

    private String tittel;
    private String beskrivelse;
    private int spilletid;
    private LocalDate utgivDato;
    ArrayList<Film> filmListe = new ArrayList<Film>();


    //public Person regissør;
    // public Person skuespiller;


    public Film(String tittel, String beskrivelse, int spilletid, LocalDate utgivDato) {
        this.tittel = tittel;
        this.beskrivelse = beskrivelse;
        this.spilletid = spilletid;
        this.utgivDato = utgivDato;
    }

    //Oppdater og endre film


    //Slette film

    public void slettFilm(Film film) {
        filmListe.remove(film);
    }


    public String getTittel() {
        return tittel;
    }

    public void setTittel(String tittel) {
        this.tittel = tittel;
    }

    public String getBeskrivelse() {
        return beskrivelse;
    }

    public void setBeskrivelse(String beskrivelse) {
        this.beskrivelse = beskrivelse;
    }

    public int getSpilletid() {
        return spilletid;
    }

    public void setSpilletid(int spilletid) {
        this.spilletid = spilletid;
    }

    public LocalDate getUtgivDato() {
        return utgivDato;
    }

    public void setUtgivDato(LocalDate utgivDato) {
        this.utgivDato = utgivDato;
    }

    @Override
    public String toString() {
        return "Navn på film er : " + tittel;
    }
}
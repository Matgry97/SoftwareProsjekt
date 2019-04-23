import java.util.ArrayList;

public class Kino extends Arrangement{
    int antallSaler;
    private ArrayList<Film.Billett> filmListe = new ArrayList<Film.Billett>();

    public Kino(int antallSaler) {
        this.antallSaler = antallSaler;
    }


    public void leggTilFilm(Film.Billett film) {
        filmListe.add(film);
    }

    public void fjernFilm(Film.Billett film) { filmListe.remove(film);}

    public ArrayList<Film.Billett> getFilmListe() {
        return filmListe;
    }

    public void setFilmListe(ArrayList<Film.Billett> filmListe) {
        this.filmListe = filmListe;
    }

    public int getAntallSaler() {
        return antallSaler;
    }

    public void setAntallSaler(int antallSaler) {
        this.antallSaler = antallSaler;
    }
}
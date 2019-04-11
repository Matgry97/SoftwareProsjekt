import java.util.ArrayList;

public class Kino extends Arrangement{
    int antallSaler;
    private ArrayList<Film> filmListe = new ArrayList<Film>();

    public Kino(int antallSaler) {
        this.antallSaler = antallSaler;
    }


    public void leggTilFilm(Film film) {
        filmListe.add(film);
    }

    public void fjernFilm(Film film) { filmListe.remove(film);}

    public ArrayList<Film> getFilmListe() {
        return filmListe;
    }

    public void setFilmListe(ArrayList<Film> filmListe) {
        this.filmListe = filmListe;
    }

    public int getAntallSaler() {
        return antallSaler;
    }

    public void setAntallSaler(int antallSaler) {
        this.antallSaler = antallSaler;
    }
}


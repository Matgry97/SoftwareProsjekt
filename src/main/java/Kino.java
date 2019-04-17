import java.util.ArrayList;

public class Kino extends Arrangement{
    int antallSaler;
    ArrayList<Film> filmListe = new ArrayList<Film>();

    public Kino(int antallSaler) {
        this.antallSaler = antallSaler;
    }


    public void leggTilFilm(Film film) {
        filmListe.add(film);
    }

    public void SlettFilm(Film film) {
        filmListe.remove(film);
    }


    public int getAntallSaler() {
        return antallSaler;
    }

    public void setAntallSaler(int antallSaler) {
        this.antallSaler = antallSaler;
    }
}


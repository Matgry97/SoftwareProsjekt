import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.*;


public class Testing {

    Kino ålesundKino = new Kino(4);
    Film harryPotter = new Film("Harry Potter", "magisk film", 100, LocalDate.of(2002, 12, 05));

    @Test
    public void test_Film_Eksisterer() {
        System.out.println(harryPotter);
        assertEquals(harryPotter, harryPotter);

    }

    @Test
    public void test_film_leggTil() {
        ArrayList<Film> filmListe = new ArrayList<Film>();
        int preLength = ålesundKino.getFilmListe().size();
        ålesundKino.leggTilFilm(harryPotter);
        int postLength = ålesundKino.getFilmListe().size();

        assertTrue(preLength < postLength, "Film lagt til");

    }

    @Test
    public void test_film_removeFilm() {
        ArrayList<Film> filmListe = new ArrayList<Film>();
        ålesundKino.leggTilFilm(harryPotter);
        int lagtTilLength = ålesundKino.getFilmListe().size();
        ålesundKino.fjernFilm(harryPotter);
        int fjernFilmLenght = ålesundKino.getFilmListe().size();

        assertFalse(lagtTilLength < fjernFilmLenght, "Film er fjernet");
    }

    @Test
    public void test_kunde_saldoEndring_kjopBillett() {
        Billett FilmBillett = new Billett("Film1", "Kino1", 1,1,10, 150, "16:30", LocalDate.of(2019, 3, 30), 1);
        Kunde Kunde1 = new Kunde(149);

        int KundeSaldoBeforeBuy = Kunde1.getSaldo();

        Kunde1.kjopBilett(FilmBillett);

        int KundeSaldoAfterBuy = Kunde1.getSaldo();

        assertFalse(KundeSaldoBeforeBuy > KundeSaldoAfterBuy, "Film er blitt kjøpt.");


    }

    @Test
    public void test_billettID_increase_kjopBilett() {
        Billett FilmBillett = new Billett("Film1", "Kino1", 1,1,10, 150, "16:30", LocalDate.of(2019, 3, 30), 1);
        Kunde Kunde1 = new Kunde(290);

        int billettIDBeforeBuy = FilmBillett.getBillettID();

        Kunde1.kjopBilett(FilmBillett);

        int billettIDAfterBuy = FilmBillett.getBillettID();

        assertFalse(billettIDBeforeBuy < billettIDAfterBuy, "IDen på billetten Øker.");
    }



}

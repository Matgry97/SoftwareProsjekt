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
    Billett FilmBillett = new Billett("Film1", "Kino1", 1,1,10, 150, "16:30", LocalDate.of(2019, 3, 30), 1);
    Kunde Kunde1 = new Kunde("mateusz", 149);
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
    public void test_kunde_ikkeNokkSaldo_kjopBillett() {
        Billett FilmBillett = new Billett("Film1", "Kino1", 1,1,10, 150, "16:30", LocalDate.of(2019, 3, 30), 1);
        Kunde Kunde1 = new Kunde("mateusz", 149);

        int KundeSaldoBeforeBuy = Kunde1.getSaldo();

        Kunde1.kjopBilett(FilmBillett);

        int KundeSaldoAfterBuy = Kunde1.getSaldo();

        assertFalse(KundeSaldoBeforeBuy > KundeSaldoAfterBuy, "Ikke nokk Saldo");


    }

    @Test
    public void test_KanKjoopeBillett_kjopBilett() {
        Kunde1.setSaldo(150);
        int KundeSaldoBeforeBuy = Kunde1.getSaldo();

        Kunde1.kjopBilett(FilmBillett);

        int KundeSaldoAfterBuy = Kunde1.getSaldo();

        assertFalse(KundeSaldoBeforeBuy > KundeSaldoAfterBuy, "Ikke nokk Saldo");
    }


    //Flere TEster her pls før vi brenner ned

    @Test
    public void trenger_Test_Test_test() {
        System.out.println("Hei dere andre");
    }

}

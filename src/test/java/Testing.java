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
    Film.Billett harryPotter = new Film("Harry Potter", "magisk film", 100, LocalDate.of(2002, 12, 05)).new Billett("Film1", "Kino1", 1,1,10, 150, "16:30", LocalDate.of(2019, 3, 30), 1);
    Kunde Kunde1 = new Kunde("mateusz", 149);
    Selger selger1 = new Selger(new Person("lars","monsen", 52),1000);
    Arrangement arrangement = new Arrangement("fotballkamp", "ullevål stadion" , "norge v sverige", 30000, "12. feb", true);

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
        ArrayList<Film.Billett> filmListe = new ArrayList<Film.Billett>();
        ålesundKino.leggTilFilm(harryPotter);
        int lagtTilLength = ålesundKino.getFilmListe().size();
        ålesundKino.fjernFilm(harryPotter);
        int fjernFilmLenght = ålesundKino.getFilmListe().size();

        assertFalse(lagtTilLength < fjernFilmLenght, "Film er fjernet");
    }
//
    @Test
    public void test_kunde_ikkeNokSaldo_kjopBillett() {

        int KundeSaldoBeforeBuy = Kunde1.getSaldo();

        Kunde1.kjopBilett(harryPotter,selger1);

        int KundeSaldoAfterBuy = Kunde1.getSaldo();

        assertFalse(KundeSaldoBeforeBuy > KundeSaldoAfterBuy, "Ikke nokk Saldo");


    }

    @Test
    public void test_KanKjoopeBillett_kjopBillett() {
        Kunde1.setSaldo(150);
        int KundeSaldoBeforeBuy = Kunde1.getSaldo();

        Kunde1.kjopBilett(harryPotter, selger1);

        int KundeSaldoAfterBuy = Kunde1.getSaldo();

        assertTrue(KundeSaldoAfterBuy>=0, "Ikke nokk Saldo");
    }

    @Test
    public void test_Pris_Endret() {
        int prePris = harryPotter.getBillettpris();
        selger1.settPris(harryPotter, 300);
        int postPris = harryPotter.getBillettpris();
        assertNotEquals(prePris, postPris, "pris ble ikke endret endret");
    }

    @Test
    public void test_endre_tilgjengelighet() {
        boolean tilgjengelig = arrangement.isTilgjengelighet();
        arrangement.setTilgjengelighet(false);
        boolean ikkeTilgjengelig = arrangement.isTilgjengelighet();
        assertNotEquals(tilgjengelig, ikkeTilgjengelig, "fremdeles tilgjengelig");
    }

}
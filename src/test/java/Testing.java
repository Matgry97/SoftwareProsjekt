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


    Person Pål = new Person("Per", "Nordmann", 37);
    Kino ålesundKino = new Kino(4);
    Film.Billett harryPotter = new Film("Harry Potter", "magisk film", 100, LocalDate.of(2002, 12, 05)).new Billett("Film1", "Kino1", 1,1,10, 150, "16:30", LocalDate.of(2019, 3, 30), 1);
    Kunde Kunde1 = new Kunde("mateusz", 149);
    Kunde Per = new Kunde("per", 2000);
    Selger pål = new Selger(Pål);


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

    @Test
    public void test_kunde_ikkeNokkSaldo_kjopBillett() {
        Film.Billett FilmBillett = new Film("Harry Potter", "magisk film", 100, LocalDate.of(2002, 12, 05)).new Billett("Film1", "Kino1", 1,1,10, 150, "16:30", LocalDate.of(2019, 3, 30), 1);
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

        Kunde1.kjopBilett(harryPotter);

        int KundeSaldoAfterBuy = Kunde1.getSaldo();

        assertFalse(KundeSaldoBeforeBuy > KundeSaldoAfterBuy, "Ikke nokk Saldo");
    }
    
    @Test
    public void testSaldoEtterAvbestilltBillett() {
        int preSaldo = Per.getSaldo();
        Per.kjopBilett(harryPotter);
        Per.avbestilleBilett(harryPotter);
        int postSaldo = Per.getSaldo();
        assertTrue(preSaldo == postSaldo, "Saldoen ble ikke den samme som den opprinnelige");
    }
    
    @Test
    public void AvbestillBillett() {
        // Må kjøpe en billett for å kunne avbestille
        Per.kjopBilett(harryPotter);
        int preLength = Per.billettListe.size();
        Per.avbestilleBilett(harryPotter);
        int postLength = Per.billettListe.size();
        assertTrue(preLength > postLength, "Avbestilt billett fungerer ikke");
    }
    
    @Test
    public void test_Slett_Film() {
        ålesundKino.leggTilFilm(harryPotter);
        int preLength = ålesundKino.getFilmListe().size();
        ålesundKino.fjernFilm(harryPotter);
        int postLength = ålesundKino.getFilmListe().size();
        assertTrue(preLength > postLength,"fungerte ikke å slette film");
    }
    
    @Test
    public void testOmBillettFinnes() {
        assertNotNull(harryPotter, "billetten finnes ikke");
    }

    @Test
    public void testOmKundeFinnes() {
        assertNotNull(Per, "Kunden finnes ikke");
    }

    @Test
    public void testOmKinoFinnes() {
        assertNotNull(ålesundKino, "kinoen finnes ikke");
    }

}

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
    
    @Test
    public void testSaldoEtterAvbestilltBillett() {
        int preSaldo = Per.getSaldo();
        Per.kjopBilett(HarryPotter);
        Per.avbestilleBilett(HarryPotter);
        int postSaldo = Per.getSaldo();
        assertTrue(preSaldo == postSaldo, "Saldoen ble ikke den samme som den opprinnelige");
    }
    
    @Test
    public void AvbestillBillett() {
        // Må kjøpe en billett for å kunne avbestille
        Per.kjopBilett(HarryPotter);
        int preLength = Per.billettListe.size();
        Per.avbestilleBilett(HarryPotter);
        int postLength = Per.billettListe.size();
        assertTrue(preLength > postLength, "Avbestilt billett fungerer ikke");
    }
    
    @Test
    public void test_Slett_Film() {
        ålesundKino.leggTilFilm(harryPotter);
        int preLength = ålesundKino.getFilmListe().size();
        ålesundKino.SlettFilm(harryPotter);
        int postLength = ålesundKino.getFilmListe().size();
        assertTrue(preLength > postLength,"fungerte ikke å slette film");
    }
    
    @Test
    public void testOmBillettFinnes() {
        assertNotNull(HarryPotter, "billetten finnes ikke");
    }

    @Test
    public void testOmKundeFinnes() {
        assertNotNull(Per, "Kunden finnes ikke");
    }

    @Test
    public void testOmKinoFinnes() {
        assertNotNull(ålesundKino, "kinoen finnes ikke");
    }
    
    @ParameterizedTest
    @ValueSource(ints = {200, 300, 400})
    public void testOpprettArrangement(int maxPlass) {
      Arrangement A = pål.opprettArrangement("SkoleLan", "Halden", "skolelan i halden", maxPlass, "2020, 11, 15", true);
        assertNotNull(A, "kunne ikke opprette arrangement");
    }
    
    @Test
    public void testErPerEnPerson() {
        assertTrue(Per instanceof Person, "Per var ingen person");
    }

}

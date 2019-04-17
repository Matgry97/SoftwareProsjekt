import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
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
    Kunde Per = new Kunde(1000);
    Billett HarryPotter = new Billett("Harry Potter", "Ålesund Kino", 3, 5, 5, 150, "17:00", LocalDate.of(2002, 12, 05));

    @Test
    public void test_Film_Eksisterer() {
        System.out.println(harryPotter);
        assertEquals(harryPotter, harryPotter);
    }

    // Litt usikker om det er vits å ta med disse..

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

    @Test
    public void test_film_leggTil() {
        int preLength = ålesundKino.filmListe.size();
        ålesundKino.leggTilFilm(harryPotter);
        int postLength = ålesundKino.filmListe.size();
        assertTrue(preLength < postLength, "Fungerte ikke å legge til film");
    }

    @Test
    public void test_Slett_Film() {
        ålesundKino.leggTilFilm(harryPotter);
        int preLength = ålesundKino.filmListe.size();
        ålesundKino.SlettFilm(harryPotter);
        int postLength = ålesundKino.filmListe.size();
        assertTrue(preLength > postLength,"fungerte ikke å slette film");
    }


    @Test
    public void testKjøpBillett() {
        int preLength = Per.billettListe.size();
        Per.kjopBilett(HarryPotter);
        int postLength = Per.billettListe.size();
        assertTrue(preLength < postLength, "Kjøping av billett fungerte ikke ");
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
    public void testSaldoEtterAvbestilltBillett() {
        int preSaldo = Per.getSaldo();
        Per.kjopBilett(HarryPotter);
        Per.avbestilleBilett(HarryPotter);
        int postSaldo = Per.getSaldo();
        assertTrue(preSaldo == postSaldo, "Saldoen ble ikke den samme som den opprinnelige");
    }
}

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
    Person person1 = new Person("Selger", "Selgesen", 18, 150);
    Selger selger = new Selger(person1);
    Billett billett = new Billett("legofilmen", "Ålesund kino", 2, 3, 12, 150, "15:30", LocalDate.of(2014,3,3), 1);
    Arrangement arrangement = new Arrangement("fotballkamp", "ullevål stadion" , "norge v sverige", 30000, "12. feb", true);
    @Test
    public void test_Film_Eksisterer() {
        System.out.println(harryPotter);
        assertEquals(harryPotter, harryPotter);

    }

    @Test
    public void test_film_leggTil() {
        ArrayList<Film> filmListe = new ArrayList<Film>();
        int preLength = ålesundKino.filmListe.size();
        ålesundKino.leggTilFilm(harryPotter);
        int postLength = ålesundKino.filmListe.size();

        assertTrue(preLength < postLength, "Film lagt til");
    }

    @Test
    public void test_Pris_Endret() {
        int prePris = billett.getBillettpris();
        selger.settPris(billett, 300);
        int postPris = billett.getBillettpris();
        assertNotEquals(prePris, postPris, "pris endret");
    }

    @Test
    public void test_endre_tilgjengelighet() {
        boolean tilgjengelig = arrangement.isTilgjengelighet();
        arrangement.setTilgjengelighet(false);
        boolean ikkeTilgjengelig = arrangement.isTilgjengelighet();
        assertNotEquals(tilgjengelig, ikkeTilgjengelig, "ikke lenger tilgjengelig");
    }
}

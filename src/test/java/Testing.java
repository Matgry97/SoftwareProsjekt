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
        int preLength = ålesundKino.filmListe.size();
        ålesundKino.leggTilFilm(harryPotter);
        int postLength = ålesundKino.filmListe.size();

        assertTrue(preLength < postLength, "Film lagt til");

    }
    
}

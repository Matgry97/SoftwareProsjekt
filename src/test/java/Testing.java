import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;

import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class Testing {

    @BeforeAll
    private ArrayList<Film> filmer;

    @Test
    public void testAddFilm(Film film) {
        filmer.add(film);
        Assertions.assertEquals(filmer.get(0));
    }


}

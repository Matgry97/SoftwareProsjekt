import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;

import java.util.ArrayList;
import static org.junit.Assert.assertEquals;

public class Testing {

    @BeforeAll
    private ArrayList<Film> filmer;

    @Test
    public void testAddFilm(Film film) {
        filmer.add(film);
        assertEquals(filmer.get(0));
    }


}

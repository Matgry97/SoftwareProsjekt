import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
//yeet
    public static void main(String[] args) {

        // public List<Film> filmListe = new ArrayList<Film>();

        Kino AalesundVikKino = new Kino(3);

        Person person3 = new Person("Selger", "Selgesen", 18, 150);

        Kunde kunde1 = new Kunde(300);

        Selger selger1 = new Selger(person3);

        Film actionJackson = new Film("Action Jackson slår til igjen","Heftig action",93, LocalDate.of(1988,7,7));
        Film deltaForce = new Film("The Delta Force"," Mega heftig action",125, LocalDate.of(1986,10,2));
        Film escapeFromNewYork = new Film("Escape from New York"," Ultra heftig action",99, LocalDate.of(1981,12,26));

        Billett billett = new Billett("legofilmen", "Ålesund kino", 2, 3, 12, 150, "15:30", LocalDate.of(2014,3,3));

        System.out.println(deltaForce);

        AalesundVikKino.leggTilFilm(actionJackson);

        kunde1.kjopBilett(billett);

        System.out.println(kunde1.getSaldo());

        Person person = new Person("Hi", "of", 18, 150);
        System.out.println(person.toString());

        selger1.opprettArrangement("siesta","soverom","sov", 100, "20.april", true);
        System.out.println(billett);
        System.out.println("billettpris endret til 100");
        selger1.settPris(billett,100);
        System.out.println(billett);
        Admin a = new Admin(person);
        System.out.println(a.toString());
        /*
        a.remove(filmListe, actionJackson);
        a.add(filmListe, deltaForce);
        a.add(filmListe, escapeFromNewYork);
        System.out.println(filmListe.toString());
        */

        System.out.println(actionJackson);


    }

}


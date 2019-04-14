import java.sql.SQLOutput;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Hei, hva heter du?");

        String scanNavn = scan.nextLine();

        System.out.println("Ditt navn er : " + scanNavn + " \n " +
                "Setemmer dette? Skriv Ja eller Nei");

        String scanJaNei = scan.nextLine();

        String sjekkInput = new String(scanJaNei);

        if(sjekkInput != "Ja") {
            System.out.println("Da går vi videre");
        } else {
            System.out.println("Feil navn? Det var du som skreiv");
        }



        ArrayList<Film> filmListe = new ArrayList<Film>();

        Kino AalesundVikKino = new Kino(3);

        Kunde kunde1 = new Kunde(300);

        Film actionJackson = new Film("Action Jackson slår til igjen","Heftig action",93, LocalDate.of(1988,7,7));
        Film deltaForce = new Film("The Delta Force"," Mega heftig action",125, LocalDate.of(1986,10,2));
        Film escapeFromNewYork = new Film("Escape from New York"," Ultra heftig action",99, LocalDate.of(1981,12,26));

        Billett billett = new Billett("legofilmen", "Ålesund kino", 2, 3, 12, 150, "15:30", LocalDate.of(2014,3,3));

        /*
        Person person = new Person("Hi", "of", 18, 150);
        System.out.println(person.toString());

        Admin a = new Admin(person);
        System.out.println(a.toString());

        a.remove(filmListe, actionJackson);
        a.add(filmListe, deltaForce);
        a.add(filmListe, escapeFromNewYork);
        System.out.println(filmListe.toString());
        */



    }

}


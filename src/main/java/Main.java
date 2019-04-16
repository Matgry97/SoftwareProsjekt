import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //public List<Film> filmListe = new ArrayList<Film>();
        List<Billett> billettListe = new ArrayList<Billett>();


        Person p = new Person("Kaido", "kaizoku", 18, 200 );
        Scanner scanner = new Scanner(System.in);

        String userName = scanner.next();
        Kunde a = new Kunde(scanner.nextLine(), 200);

        Billett billett1 = new Billett("legofilmen", "Ålesund kino", 2, 3, 12, 90, "15:30", LocalDate.of(2014,3,3));
        Billett billett2 = new Billett("emojifilmen", "Ålesund kino", 3, 3, 12, 300, "14:30", LocalDate.of(2015,3,3));
        billettListe.add(billett1);
        billettListe.add(billett2);

        System.out.println("1) Kjøp billett" + "\n" + "2) Selger"
        );

        int userChoice = scanner.nextInt();

        if (userChoice == 1) {
            for (int i = 0; i < billettListe.size(); i++) {
                System.out.println(i + ") " + billettListe.get(i).getFilmnavn() + " - " + billettListe.get(i).getBillettpris());

            }
            int menuChoice = scanner.nextInt();
            a.kjopBilett(billettListe.get(menuChoice));
        }
        else if (userChoice == 2) {
            System.out.println("Fikser senere");
        }

        /*

        Kino AalesundVikKino = new Kino(3);

        Kunde kunde1 = new Kunde(100);

        Film actionJackson = new Film("Action Jackson slår til igjen","Heftig action",93, LocalDate.of(1988,7,7));
        Film deltaForce = new Film("The Delta Force"," Mega heftig action",125, LocalDate.of(1986,10,2));
        Film escapeFromNewYork = new Film("Escape from New York"," Ultra heftig action",99, LocalDate.of(1981,12,26));
*/



        /*
        System.out.println(deltaForce);

        AalesundVikKino.leggTilFilm(actionJackson);

        kunde1.kjopBilett(billett);

        System.out.println(kunde1.getSaldo());

        Person person = new Person("Hi", "of", 18, 150);
        System.out.println(person.toString());

        Admin a = new Admin(person);
        System.out.println(a.toString());

        a.remove(filmListe, actionJackson);
        a.add(filmListe, deltaForce);
        a.add(filmListe, escapeFromNewYork);
        System.out.println(filmListe.toString());


        System.out.println(actionJackson);
        */

    }

}


import java.sql.SQLOutput;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /*
        List<Billett> billettListe = new ArrayList<Billett>();


        Scanner scanner = new Scanner(System.in);

        String userName = scanner.next();
        Kunde a = new Kunde(scanner.nextLine(), 200);

        Billett billett1 = new Billett("legofilmen", "Ålesund kino", 2, 3, 12, 90, "15:30", LocalDate.of(2014,3,3),1);
        Billett billett2 = new Billett("emojifilmen", "Ålesund kino", 3, 3, 12, 300, "14:30", LocalDate.of(2015,3,3),1 );
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
            System.out.println(".");
        }
        */



        ArrayList<Film> filmListe = new ArrayList<Film>();

        Kino AalesundVikKino = new Kino(3);
        Kunde kunde1 = new Kunde("mateusz", 150);
        Selger selger = new Selger(new Person("Asd", "das", 29), 300);

        Film.Billett actionJackson = new Film("Action Jackson slår til igjen","Heftig action",93, LocalDate.of(1988,7,7)).new Billett("legofilmen", "Ålesund kino", 2, 3, 12, 150, "15:30", LocalDate.of(2014,3,3), 1);
        Film deltaForce = new Film("The Delta Force"," Mega heftig action",125, LocalDate.of(1986,10,2));
        Film escapeFromNewYork = new Film("Escape from New York"," Ultra heftig action",99, LocalDate.of(1981,12,26));

        kunde1.kjopBilett(actionJackson, selger);










    }

}


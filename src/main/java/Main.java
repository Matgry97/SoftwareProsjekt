import java.sql.SQLOutput;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    static List<Film.Billett> billettListe = new ArrayList<Film.Billett>();
    static List<Film> filmListeSelger = new ArrayList<Film>();
    static Scanner scanner;

    public static void main(String[] args) {
        int check = 1;


            //Film bergen = new Film("LegoFilm", "Bergen Kino",  LocalDate.of(2014,3,3));
            Film bergen = new Film("LegoFilm", "Bergen Kino", 1, LocalDate.of(2014, 3, 3));
            filmListeSelger.add(bergen);

            System.out.println("Skriv inn et brukernavn");

            Scanner scanner = new Scanner(System.in);

            String userName = scanner.next();
            Kunde a = new Kunde(scanner.nextLine(), "", 0, 200);

            System.out.println("Hva er din alder?");

            int userAlder = scanner.nextInt();

            Person user = new Person(userName, "", userAlder);
            System.out.println(user);
            Person Selger = new Person("Ola", "Normann", 20);
            Selger KinoEier = new Selger(Selger, 0);


            Film.Billett billett1 = new Film("LegoFilm", "Bergen Kino", 1, LocalDate.of(2014, 3, 3)).new Billett();
            //Film.Billett billett2 = new Film("Batman", "Ålesund kino",  1, LocalDate.of(2015,3,3)).new Billett("emojifilmen", "Ålesund kino", "","", 175, "14:30", LocalDate.of(2015,3,3), 1);
            billettListe.add(billett1);

            while (check == 1) {

            System.out.println("1) Kjøp billett" + "\n" + "2) Selger "
            );

            int userChoice = scanner.nextInt();

            if (userChoice == 1) {
                System.out.println("    ---|| Velg film || ---");
                for (int i = 0; i < billettListe.size(); i++) {
                    System.out.println(i + ") " + billettListe.get(i).getTittel() + " - " + billettListe.get(i).getBillettpris());

                }
                int menuChoice = scanner.nextInt();
                a.kjopBilett(billettListe.get(menuChoice), KinoEier);
            } else if (userChoice == 2) {

                System.out.println("1) Legg ny Film" + "\n" + "2) Slett eksisterende filmer"
                );

                int selgerChoice = scanner.nextInt();

                if (selgerChoice == 1) {

                    lagFilm();


                } else if (selgerChoice == 2) {
                    System.out.println("    ---|| Hvilken film vil du slette? || ---");
                    for (int i = 0; i < filmListeSelger.size(); i++) {
                        System.out.println(i + ") " + filmListeSelger.get(i).getTittel());
                    }

                    int slettFilmScan = scanner.nextInt();

                    if (filmListeSelger.isEmpty()) {
                        System.out.println("Det finnes ingen filmer");
                        System.out.println("------------------------");
                        System.out.println("Lag en film først!");

                    } else {
                        if (!filmListeSelger.isEmpty()) {
                            filmListeSelger.remove(slettFilmScan);
                        }
                    }

                    System.out.println(filmListeSelger);
                    System.out.println("Ingen flere filmer å slette" + "\n");
                    System.out.println("1) Legg til ny Film" + "\n" + "2) Slett eksisterende filmer");

                    selgerChoice = scanner.nextInt();
                    if (selgerChoice == 1) {
                        lagFilm();
                    } else {
                        System.out.println("err");
                    }

                }


            } //her på vi loope til start. {

        }
    }

    private static void lagFilm() {
        scanner = new Scanner(System.in);

        Film selgerFilm = new Film();
        System.out.println("Skriv inn navn på film: ");
        String t = scanner.next();
        selgerFilm.setTittel(t);


        System.out.println("Skriv inn en beskrivelse på filmen: ");
        String b = scanner.next();
        selgerFilm.setBeskrivelse(b);

        filmListeSelger.add(selgerFilm);
    }

}


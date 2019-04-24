import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    static List<Film.Billett> billettListe = new ArrayList<Film.Billett>();
    static List<Film> filmListeSelger = new ArrayList<Film>();
    static Scanner scanner;
    static List<Film.Billett> minBillettListe = new ArrayList<Film.Billett>();

    public static void main(String[] args) {
        int check = 1;



            Film bergen = new Film("LegoFilm", "Bergen Kino", LocalDate.of(2014, 3, 3));
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


            Film.Billett billett1 = new Film("Batman", "Ålesund kino", LocalDate.of(2015,3,3)).new Billett("emojifilmen", "Ålesund kino", "","", "", 100, "15:30", LocalDate.of(2015,3,3), 1);
            Film.Billett billett2 = new Film("Batman", "Ålesund kino", LocalDate.of(2015,3,3)).new Billett("Batmanfilmen", "Ålesund kino", "","", "", 100, "15:30", LocalDate.of(2015,3,3), 1);
            billettListe.add(billett1);
            billettListe.add(billett2);

            while (check == 1) {

            System.out.println("1) Kjøp billett" + "\n" + "2) Kjøp flere billetter" + "\n" + "3) Selger" + "\n" + "4) Mine billetter"
            );

            int userChoice = scanner.nextInt();

            if (userChoice == 1) {
                System.out.println("    ---|| Velg film || ---");
                for (int i = 0; i < billettListe.size(); i++) {
                    System.out.println(i + ") " + billettListe.get(i).getTittel() + " - " + billettListe.get(i).getBillettpris());

                }
                int menuChoice = scanner.nextInt();

                //Kino.mainMethod(billettListe.get(menuChoice), KinoEier, a);
                //System.out.println(Kino.mainMethod(billettListe.get(menuChoice), KinoEier, a));
                a.kjopBilett(billettListe.get(menuChoice), KinoEier);
                minBillettListe.add(billettListe.get(menuChoice));



            }

            if (userChoice == 2) {
                System.out.println("    ---|| Velg film || ---");
                for (int i = 0; i < billettListe.size(); i++) {
                    System.out.println(i + ") " + billettListe.get(i).getTittel() + " - " + billettListe.get(i).getBillettpris()); }
                    int menuChoice = scanner.nextInt();
                    System.out.println("Antall billetter: ");
                    int antall = scanner.nextInt();

                    a.KjopFlereBiletter(billettListe.get(menuChoice), antall, KinoEier);
                    minBillettListe.add(billettListe.get(menuChoice));

                }

                else if (userChoice == 3) {

                System.out.println("1) Legg ny Film" + "\n" + "2) Slett eksisterende filmer"
                );

                int selgerChoice = scanner.nextInt();

                if (selgerChoice == 1) {

                    selgerLagFilm();


                } else if (selgerChoice == 2) {
                    selgerSlettFilm();
                    selgerChoice = scanner.nextInt();
                    if (selgerChoice == 1) {
                        selgerLagFilm();
                    } else {
                        System.out.println("err");
                    }

                }
            } else if (userChoice == 4) {
                if (!minBillettListe.isEmpty()) {
                    for (int i = 0; i < minBillettListe.size(); i++) {
                    System.out.println("\n" + minBillettListe.get(i) + "\n");
                    }
                }
                else {
                    System.out.println("Ingen billetter tilgjengelig for bruker");
                }

                }

        }
    }

    private static void selgerSlettFilm() {
        scanner = new Scanner(System.in);
        System.out.println("    ---|| Hvilken film vil du slette? || ---");
        if (!filmListeSelger.isEmpty()) {
            for (int i = 0; i < filmListeSelger.size(); i++) {
                System.out.println(i + ") " + filmListeSelger.get(i).getTittel());
            }
        }
        else {
            System.out.println("Ingen filmer");
        }

        //int slettFilmScan = scanner.nextInt();

        if (filmListeSelger.isEmpty()) {
            System.out.println("Det finnes ingen filmer");
            System.out.println("------------------------");
            System.out.println("Lag en film først!");

        } else {
            if (!filmListeSelger.isEmpty()) {
                int slettFilmScan = scanner.nextInt();
                filmListeSelger.remove(slettFilmScan);
            }
        }
        System.out.println("1) Legg til ny Film" + "\n" + "2) Slett eksisterende filmer");
    }

    private static void selgerLagFilm() {
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


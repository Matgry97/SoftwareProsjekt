import java.util.ArrayList;
import java.util.Scanner;

public class Kino extends Arrangement{
    private ArrayList<Film.Billett> filmListe = new ArrayList<Film.Billett>();

    public Kino(String navn, String sted, String beskrivelse, int maxPlass, ArrayList<Film.Billett> filmListe) {
        super(navn, sted, beskrivelse, maxPlass);
        this.filmListe = filmListe;
    }

    static Scanner input = new Scanner(System.in);
    static String arrS[][] = new String[5][5];
    static String cName[] = {"A","B","C","D","E"};

    static int i, j;

    static void printTable() {
        for (i=0; i<5; ++i) {
            for (j=0; j<5; ++j) {
                System.out.print(arrS[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }

    static boolean isAvailable(String vData) {
        for (i=0; i<5; ++i) {
            for (j=0; j<5; ++j) {
                if ((arrS[i][j]).equalsIgnoreCase(vData)) {
                    arrS[i][j]="X";
                    return true;
                }
            }
        }
        return false;
    }

    static boolean isFull() {
        for (i=0; i<5; ++i) {
            for (j=0; j<5; ++j) {
                if (!(arrS[i][j]).equals("X")) {
                    return false;

                }
            }
        }
        return true;

    }

    public static String mainMethod(Film.Billett fb, Selger selger, Kunde kunde) {
        String inData = new String("");
        for (i=0; i<5; ++i) {
            for (j=0; j<5; ++j) {
                arrS[i][j] = new String((i+1) + cName[j]);
            }
        }

        do {
            printTable();
            if (isFull())
            {
                System.out.println("Det er Fullt");
                inData="X";
            }
            else
            {
                System.out.print("Velg sete: ");
                inData = input.next();

                if (isAvailable(inData)) {
                    System.out.println("Du har reservert sete!");

                    kunde.kjopBilett(fb, selger);
                    System.out.println(fb.toString());
                    System.out.println("Sete : " + inData.toUpperCase() + "\n");

                }
                else
                    System.out.println("Setet er opptatt!");

            }
        } while (!inData.equalsIgnoreCase("X"));
        return inData;
    }



    public void leggTilFilm(Film.Billett film) {
        filmListe.add(film);
    }

    public void fjernFilm(Film.Billett film) { filmListe.remove(film);}

    public ArrayList<Film.Billett> getFilmListe() {
        return filmListe;
    }

    public void setFilmListe(ArrayList<Film.Billett> filmListe) {
        this.filmListe = filmListe;
    }

}


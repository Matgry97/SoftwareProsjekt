import java.time.LocalDate;
import java.util.ArrayList;

public class Film {

    private String tittel;
    private String beskrivelse;
    private LocalDate utgivDato;
    ArrayList<Film> filmListe = new ArrayList<Film>();


    public Film(String tittel, String beskrivelse, LocalDate utgivDato) {
        this.tittel = tittel;
        this.beskrivelse = beskrivelse;
        this.utgivDato = utgivDato;
    }

    public Film(){}

    public void slettFilm(Film film) { filmListe.remove(film); }

    public String getTittel() { return tittel; }

    public void setTittel(String tittel) { this.tittel = tittel; }

    public String getBeskrivelse() { return beskrivelse; }

    public void setBeskrivelse(String beskrivelse) { this.beskrivelse = beskrivelse; }

    public LocalDate getUtgivDato() { return utgivDato; }

    public void setUtgivDato(LocalDate utgivDato) { this.utgivDato = utgivDato; }

    @Override
    public String toString() {
        return "Navn på film er : " + tittel;
    }


    public class Billett {
            // Dette er for film
            private String tittel;
            private String beskrivelse;
            private String kinonavn;
            private String radnr;
            private String setenr;
            private int billettpris;

            //Felles variabler
            private int billettID;
            private String klokkeslett;
            private LocalDate dato;




        public Billett(String tittel, String beskrivelse, String kinonavn, String radnr, String setenr, int billettpris, String klokkeslett, LocalDate dato, int billettID) {
            this.tittel = tittel;
            this.beskrivelse = beskrivelse;
            this.kinonavn = kinonavn;
            this.radnr = radnr;
            this.setenr = setenr;
            this.billettpris = billettpris;
            this.klokkeslett = klokkeslett;
            this.dato = dato;
            this.billettID = billettID;
        }

        public String getTittel() {
            return this.tittel;
        }

        public String getBeskrivelse() {
            return this.beskrivelse;
        }

        public int getBillettID() { return billettID;}

        public void setBilettID(int billettID) {this.billettID = billettID; }

        public String getKinonavn() {
            return kinonavn;
        }

        public void setKinonavn(String kinonavn) {
            this.kinonavn = kinonavn;
        }

        public String getRadnr() {
            return radnr;
        }

        public void setRadnr(String radnr) {
            this.radnr = radnr;
        }

        public String getSetenr() {
            return setenr;
        }

        public void setSetenr(String setenr) {
            this.setenr = setenr;
        }

        public int getBillettpris() {
            return billettpris;
        }

        public void setBillettpris(int billettpris) {
            this.billettpris = billettpris;
        }

        public String getKlokkeslett() {
            return klokkeslett;
        }

        public void setKlokkeslett(String klokkeslett) {
            this.klokkeslett = klokkeslett;
        }

        public LocalDate getDato() {
            return dato;
        }

        public void setDato(LocalDate dato) {
            this.dato = dato;
        }

        @Override
        public String toString() {
            return  "----|| Din bilett er ||----" + "\n" +
                    "Film :  " + getTittel() + " \n" +
                    "Kino : " + this.kinonavn + "\n" +
                    "Rad : " + this.radnr + ", Sete : " + this.setenr + "\n" +
                    "Klokken : " + this.klokkeslett + "\n" +
                    "Pris : " + this.billettpris + "\n" +
                    "ID : " + this.billettID;
        }
    }
}

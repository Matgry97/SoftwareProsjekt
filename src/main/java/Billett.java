import java.time.LocalDate;

public class Billett {

        private String filmnavn;
        private String kinonavn;
        private int salnr;
        private int radnr;
        private int setenr;
        private int billettpris;

        private int billettID;
        private String klokkeslett;
        private LocalDate dato;

        public Billett(String filmnavn, String kinonavn, int salnr, int radnr, int setenr, int billettpris, String klokkeslett, LocalDate dato, int billettID) {
            this.filmnavn = filmnavn;
            this.kinonavn = kinonavn;
            this.salnr = salnr;
            this.radnr = radnr;
            this.setenr = setenr;
            this.billettpris = billettpris;
            this.klokkeslett = klokkeslett;
            this.dato = dato;
            this.billettID = billettID;
        }

        public String getFilmnavn() {
            return filmnavn;
        }

        public void setFilmnavn(String filmnavn) {
            this.filmnavn = filmnavn;
        }

        public String getKinonavn() {
            return kinonavn;
        }

        public void setKinonavn(String kinonavn) {
            this.kinonavn = kinonavn;
        }

        public int getSalnr() {
            return salnr;
        }

        public void setSalnr(int salnr) {
            this.salnr = salnr;
        }

        public int getRadnr() {
            return radnr;
        }

        public void setRadnr(int radnr) {
            this.radnr = radnr;
        }

        public int getSetenr() {
            return setenr;
        }

        public void setSetenr(int setenr) {
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
            return "billetpris: " + getBillettpris();
        }
    }

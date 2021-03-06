import java.util.ArrayList;

public class Kunde extends Person {
    private int saldo;
    private Arrangement Arrangement;
    private int unikId;

    ArrayList<Film.Billett> billettListe = new ArrayList<Film.Billett>();

    public Kunde(String fornavn, String etternavn, int alder, int saldo) {
        super(fornavn, etternavn, alder);
        this.saldo = saldo;

    }


    public void kjopBilett(Film.Billett billett, Selger selger) {
        int pris = billett.getBillettpris();

        if (this.saldo - pris >= 0) {
            this.unikId++;
            this.saldo = saldo - pris;
            billettListe.add(billett);
            billett.setBilettID(this.unikId);
            selger.setSaldo(selger.getSaldo() + billett.getBillettpris());


            System.out.println("Du har kjøpt billett til filmen " + billett.getTittel());
            System.out.println(billett.toString());



            System.out.println("---|| Gjenstående Saldo på Konto ||--- \n" +
                getSaldo() + " kroner. \n"
            );
        }
        else {
            System.out.println("Feil ved kjøp av billett!" + "\n" +  "Mangler " + (billett.getBillettpris()-saldo) + "kr");
        }
    }

    public void KjopFlereBiletter(Film.Billett billett, int antall, Selger selger) {
        for (int i = 0; i < antall; i++) {
            kjopBilett(billett, selger);
            billett.setBilettID(i);
        }
    }


     public void avbestilleBilett(Film.Billett billett, Kino kino) {
            billettListe.remove(billett);
            setSaldo(this.saldo + billett.getBillettpris());
            System.out.println("Du har fått tilbake: " + billett.getBillettpris() + " kroner, og billetten er refundert");
        }




    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public int getSaldo() {
        return this.saldo;
    }


}


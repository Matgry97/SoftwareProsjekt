import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.ArrayList;

public class Kunde extends Person {
    private int saldo;
    private Arrangement Arrangement;
    private int unikId;

    ArrayList<Billett> billettListe = new ArrayList<Billett>();

    public Kunde(String fornavn, int saldo) {
        this.saldo = saldo;

    }

    public void kjopBilett(Billett billett) {
        int pris = billett.getBillettpris();

        if (this.saldo - pris >= 0) {
            this.unikId++;
            this.saldo = saldo - pris;
            billettListe.add(billett);
            billett.setBilettID(this.unikId);

            System.out.println("Du har kjøpt billett til filmen " + billett.getFilmnavn());


            System.out.println(billett.toString());



            System.out.println("---|| Gjenstående Saldo på Konto ||--- \n" +
                getSaldo() + " kroner"
            );

        }
    }

    public int idTeller (int counter) {
        counter++;
        return counter;
    }

    public void avbestilleBilett(Billett billett) {
        //Trenger Test
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


import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.ArrayList;

public class Kunde extends Person {
    private int saldo;
    private String fornavn;
    ArrayList<Billett> billettListe = new ArrayList<Billett>();

   public Kunde(int saldo) {
       this.saldo = saldo;
   }

   public Kunde(String fornavn, int saldo) {
        this.fornavn = fornavn;
        this.saldo = saldo;
    }

   public void kjopBilett(Billett billett) {
       //Trenger Test
       if (saldo - billett.getBillettpris() >= 0) {
           billettListe.add(billett);
           setSaldo(saldo - billett.getBillettpris());
           System.out.println("Du har kjøpt billett til filmen " + billett.getFilmnavn());
       }
       else {
           System.out.println("Feil ved kjøp av billett, mangler " + (billett.getBillettpris()-saldo) + "kr");
       }
   }

   public void avbestilleBilett(Billett billett) {
       //Trenger Test
       billettListe.remove(billett);
       setSaldo(this.saldo + billett.getBillettpris());

       System.out.println("Du har fått tilbake: " + billett.getBillettpris() + " kroner, og billetten er refundert");
   }


    public void setSaldo(int Saldo) {this.saldo = saldo;}

    public int getSaldo() {return this.saldo;}

}

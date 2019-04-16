import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.ArrayList;

public class Kunde extends Person {
    private int saldo;
    private Arrangement Arrangement;

    ArrayList<Billett> billettListe = new ArrayList<Billett>();

   public Kunde(int saldo) {
       this.saldo = saldo;
   }

   public void kjopBilett(Billett billett) {
       int pris = billett.getBillettpris();

       if (this.saldo - pris >= 0) {
           billettListe.add(billett);
           this.saldo = saldo - pris;

       }else {
           System.out.println("Ikke dekning på konto, fattig lus");
       }
   }

     // System.out.println("Du har kjøpt billett til filmen " + billett.getFilmnavn());


   public void avbestilleBilett(Billett billett) {
       //Trenger Test
       billettListe.remove(billett);
       setSaldo(this.saldo + billett.getBillettpris());

       System.out.println("Du har fått tilbake: " + billett.getBillettpris() + " kroner, og billetten er refundert");
   }


    public void setSaldo(int Saldo) {this.saldo = saldo;}

    public int getSaldo() {return this.saldo;}

}

import java.util.List;

public class Selger {

    private Person selger;
    private int saldo;

    public Selger(Person selger, int saldo) {
        this.selger = selger;
        this.saldo = saldo;
    }
    
     public Arrangement opprettArrangement(String navn, String sted, String beskrivelse, int maxPlass){
        Arrangement arrangement = new Arrangement(navn, sted, beskrivelse, maxPlass);

        return arrangement;
    }


    public Person getSelger() {
        return selger;
    }

    public void setSelger(Person selger) {
        this.selger = selger;
    }

    @Override
    public String toString(){
        return "Selger{" +
                "selger=" + selger +
                '}';
    }

    public void addKino(List list, Kino kino) {
        list.add(kino);
    }

    public void removeKino(List list, Kino kino) {
        list.remove(kino);
    }

    public void settPris(Film.Billett billett, int billettpris){
        billett.setBillettpris(billettpris);
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
}

import java.util.List;

public class Selger {

    private Person selger;
    private int saldo;

    public Selger(Person selger, int saldo) {
        this.selger = selger;
        this.saldo = saldo;
    }

    public Arrangement opprettArrangement(String navn, String sted, String beskrivelse, int maxPlass, String dato, boolean tilgjengelighet){
        Arrangement arrangement = new Arrangement(navn, sted, beskrivelse, maxPlass, dato, tilgjengelighet);

        return arrangement;
    }

    public void settPris(Film.Billett billett, int billettpris){
        billett.setBillettpris(billettpris);
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

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
}

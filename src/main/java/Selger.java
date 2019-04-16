import java.util.List;

public class Selger {

    private Person selger;

    public Selger(Person selger) {
        this.selger = selger;
    }

    public void opprettArrangement(String navn, String sted, String beskrivelse, int maxPlass, String dato, boolean tilgjengelighet){
        Arrangement arrangement = new Arrangement(navn, sted, beskrivelse, maxPlass, dato, tilgjengelighet);
        System.out.println(arrangement);
    }

    public void settPris(Billett billett, int billettpris){
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
}

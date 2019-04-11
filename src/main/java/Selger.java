import java.util.List;

public class Selger {

    private Person selger;

    public Selger(Person selger) {
        this.selger = selger;
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

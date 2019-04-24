import java.util.ArrayList;

public class Arrangement {

    private String navn;
    private String sted;
    private String beskrivelse;
    private int maxPlass;
    private String dato;

    public Arrangement() {this ("","","",0,""); }

    public Arrangement(String navn, String sted, String beskrivelse, int maxPlass, String dato) {
        this.navn = navn;
        this.sted = sted;
        this.beskrivelse = beskrivelse;
        this.maxPlass = maxPlass;
        this.dato = dato;

    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public String getSted() {
        return sted;
    }

    public void setSted(String sted) {
        this.sted = sted;
    }

    public String getBeskrivelse() {
        return beskrivelse;
    }

    public void setBeskrivelse(String beskrivelse) {
        this.beskrivelse = beskrivelse;
    }

    public int getMaxPlass() {
        return maxPlass;
    }

    public void setMaxPlass(int maxPlass) {
        this.maxPlass = maxPlass;
    }

    public String getDato() {
        return dato;
    }

    public void setDato(String dato) {
        this.dato = dato;
    }
}

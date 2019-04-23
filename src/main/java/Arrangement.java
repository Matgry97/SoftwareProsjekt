public class Arrangement {
//
    private String navn;
    private String sted;
    private String beskrivelse;
    private int maxPlass;
    private String dato;
    private boolean tilgjengelighet;

    public Arrangement() {this ("","","",0,"", true ); }

    public Arrangement(String navn, String sted, String beskrivelse, int maxPlass, String dato, boolean tilgjengelighet) {
        this.navn = navn;
        this.sted = sted;
        this.beskrivelse = beskrivelse;
        this.maxPlass = maxPlass;
        this.dato = dato;
        this.tilgjengelighet = tilgjengelighet;
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

    public boolean isTilgjengelighet() {
        return tilgjengelighet;
    }

    public void setTilgjengelighet(boolean tilgjengelighet) {
        this.tilgjengelighet = tilgjengelighet;
    }

    @Override
    public String toString(){
        return "Arrangementnavn: " + getNavn() + "\n"+ "sted: " + getSted() + "\n"
                + "beskrivelse: " + getBeskrivelse() + "\n" +  "antall plasser: " + getMaxPlass() + "\n"
                + "dato: " + getDato() + "\n";
    }
}

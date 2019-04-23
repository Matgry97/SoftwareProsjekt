public class Person {

    private String fornavn;
    private String etternavn;
    private int alder;

    public Person(String fornavn, String etternavn, int alder) {
        this.fornavn = fornavn;
        this.etternavn = etternavn;
        this.alder = alder;
    }

    public Person() {}

    public String getFornavn() {
        return this.fornavn;
    }

    public String getEtternavn() {
        return this.etternavn;
    }

    public int getAlder() {
        return this.alder;
    }

    public void setFornavn(String fornavn) {
        this.fornavn = fornavn;
    }

    public void setEtternavn(String Etternavn) {
        this.etternavn = etternavn;
    }

    public void setAlder(int alder) {
        this.alder = alder;
    }

    @Override
    public String toString() {
        return this.fornavn + " " + this.etternavn + " " + this.alder;
    }

}

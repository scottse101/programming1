/**
 * Klassen Rett.
 */
public class Rett {

    private final String navn;
    private final String type;
    private final double pris;

    /**
     * Konstruktøren Rett.
     *
     * @param navn navn
     * @param type type
     * @param pris pris
     */
    public Rett(String navn, String type, double pris) {
        this.navn = navn;
        this.type = type;
        this.pris = pris;
    }

    /**
     * Gets navn.
     *
     * @return the navn
     */
    public String getNavn() {
        return navn;
    }

    /**
     * Gets type.
     *
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * Gets pris.
     *
     * @return the pris
     */
    public double getPris() {
        return pris;
    }
    //Override toString-generate fungerer ikke???
    public String toString() {
        String listeAvRetter = "";
        listeAvRetter = listeAvRetter.concat("Navn av retten:" + getNavn());
        listeAvRetter = listeAvRetter.concat("\nType av retten: " + getType());
        listeAvRetter = listeAvRetter.concat("\nPris: " + getPris());

        return listeAvRetter;
    }

}

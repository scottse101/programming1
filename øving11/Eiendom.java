/**
 * Klassen Eiendom.
 */
public class Eiendom {

    private int kommunenummer;
    private String kommunenavn;
    private int gaardsnummer;
    private int bruksnummer;
    private String bruksnavn;
    private double areal;
    private String eier;

    /**
     * Konstruktøren Eiendom.
     *
     * @param kommunenummer kommunenummer
     * @param kommunenavn   kommunenavn
     * @param gaardsnummer  gaardsnummer
     * @param bruksnummer   bruksnummer
     * @param bruksnavn     bruksnavn
     * @param areal         areal
     * @param eier          eier
     */
    public Eiendom(int kommunenummer, String kommunenavn, int gaardsnummer,
                   int bruksnummer, String bruksnavn, double areal, String eier) {
        if (kommunenummer < 101 || kommunenummer > 5054) {
            throw new IllegalArgumentException("Kommunenummeret må være mellom 101 og 5054.");
        }

        if (gaardsnummer < 0) {
            throw new IllegalArgumentException("Gårdsnummeret må være et positivt heltall.");
        }

        if (bruksnummer < 0) {
            throw new IllegalArgumentException("Bruksnummeret må være et positivt heltall.");
        }

        this.kommunenummer = kommunenummer;
        this.kommunenavn = kommunenavn;
        this.gaardsnummer = gaardsnummer;
        this.bruksnummer = bruksnummer;
        this.bruksnavn = bruksnavn;
        this.areal = areal;
        this.eier = eier;
    }

    /**
     * Gets kommunenavn.
     *
     * @return kommunenavn
     */
    public String getKommunenavn() {
        return kommunenavn;
    }

    /**
     * Gets kommunenummer.
     *
     * @return kommunenummer
     */
    public int getKommunenummer() {
        return kommunenummer;
    }

    /**
     * Gets gaardsnummer.
     *
     * @return gaardsnummer
     */
    public int getGaardsnummer() {
        return gaardsnummer;
    }

    /**
     * Gets bruksnummer.
     *
     * @return bruksnummer
     */
    public int getBruksnummer() {
        return bruksnummer;
    }

    /**
     * Gets bruksnavn.
     *
     * @return bruksnavn
     */
    public String getBruksnavn() {
        return bruksnavn;
    }

    /**
     * Gets areal.
     *
     * @return areal
     */
    public double getAreal() {
        return areal;
    }

    /**
     * Gets eier.
     *
     * @return eier
     */
    public String getEier() {
        return eier;
    }

    /**
     * Gets id.
     *
     * @return eiendomsID
     */
    public String getID() {
        String eiendomsID = "";
        eiendomsID = eiendomsID.concat(getKommunenummer() + "-" + getGaardsnummer() + "/" + getKommunenummer());

        return eiendomsID;
    }

    @Override
    public String toString() {
        String eiendomToString = "";
        eiendomToString = eiendomToString.concat("Kommunenummer og navn: " + getKommunenummer() + " " + getKommunenavn());
        eiendomToString = eiendomToString.concat("\n Gårdsnummer: " + getGaardsnummer() + ". \n Bruksnummer: " + getBruksnummer());
        eiendomToString = eiendomToString.concat("\n Bruksnavn: " + getBruksnavn() + "\n Areal: " + getAreal());
        eiendomToString = eiendomToString.concat("\n Eieren av eiendommen: " + getEier() + "\n");

        return eiendomToString;
    }
}

import java.util.ArrayList;

/**
 * Klassen Eiendomsregister.
 */
public class EiendomsRegister {

    private ArrayList<Eiendom> eiendommer;

    /**
     * Konstruktøren Eiendomsregister.
     */
    public EiendomsRegister() {
        this.eiendommer = new ArrayList<Eiendom>();
    }

    /**
     * Metode for å legge til en ny eiendom.
     *
     * @param newEiendom nye eiendommen
     */
    public void addEiendom(Eiendom newEiendom) {
        if (findEiendom(newEiendom.getKommunenummer(), newEiendom.getGaardsnummer(), newEiendom.getBruksnummer()) != null) {
            throw new IllegalArgumentException("EiendomsID eksisterer allerede.");
        }
        this.eiendommer.add(newEiendom);
    }

    /**
     * Metode for antall eiendommer int.
     *
     * @return eiendom
     */
    public int numberOfEiendom() {
        return eiendommer.size();
    }

    /**
     * Metode for å finne eiendom ved å søke på kommunenummer, gårdsnummer og bruksnummer.
     *
     * @param kommunenummer
     * @param gaardsnummer
     * @param bruksnummer
     * @return eiendom
     */
    public Eiendom findEiendom(int kommunenummer, int gaardsnummer, int bruksnummer) {
        String searchEiendom = String.format("%d-%d/%d", kommunenummer, gaardsnummer, bruksnummer);

        for (Eiendom eiendom : this.eiendommer) {
            if(searchEiendom.equals(eiendom.getID())) {
                return eiendom;
            }
        }

        return null;
    }

    /**
     * Gets gjennomsnitt areal. Metoden teller summen av alle arealene til alle eiendommene delt på antall eiendommer.
     *
     * @return gjennomsnitt areal
     */
    public double getGjennomsnittAreal() {
        double sum = 0;

        for (Eiendom eiendom : this.eiendommer) {
            sum += eiendom.getAreal();
        }

        return sum / numberOfEiendom();
    }

    @Override
    public String toString() {
        String eiendomList = "";
        for (Eiendom eiendom : this.eiendommer) {
            eiendomList = eiendomList.concat(eiendom.toString());
            eiendomList = eiendomList.concat("\n");
        }

        return eiendomList;
    }
}

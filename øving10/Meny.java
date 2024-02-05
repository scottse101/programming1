import java.util.ArrayList;

/**
 * Klassen Meny.
 */
public class Meny {

    private final String menyNavn;
    private final ArrayList<Rett> retter;

    /**
     * Konstruktøren Meny.
     *
     * @param menyNavn navnet på menyen
     * @param retter  retter på menyen
     */
    public Meny(String menyNavn, ArrayList<Rett> retter) {
        this.menyNavn = menyNavn;
        this.retter = retter;
    }

    /**
     * Gets for meny navn.
     *
     * @return meny navn
     */
    public String getMenyNavn() {
        return menyNavn;
    }

    /**
     * Gets meny pris.
     *
     * @return meny pris
     */
    public double getMenyPris() {
        double sum = 0;
        for (Rett rett : this.retter) {
            sum += rett.getPris();
        }
        return sum;
    }
    /*
     * ToString metode for menyobjektet
     */
    public String toString() {
        String listeAvMenyer = "";
        listeAvMenyer = listeAvMenyer.concat("Navn på menyen: " + getMenyNavn());
        listeAvMenyer = listeAvMenyer.concat("\nRetter i menyen: \n");

        for (Rett rett : this.retter) {
            listeAvMenyer = listeAvMenyer.concat(rett.toString() + "\n\n");
        }

        listeAvMenyer = listeAvMenyer.concat("Total pris: " + getMenyPris());

        return listeAvMenyer;
    }
}

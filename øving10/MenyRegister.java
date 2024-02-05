import java.util.ArrayList;

/**
 * Klassen Meny register.
 */
public class MenyRegister {

    private final ArrayList<Rett> retter;
    private final ArrayList<Meny> menyer;

    /**
     * Konstruktøren Meny register.
     */
    public MenyRegister() {
        this.menyer = new ArrayList<Meny>();
        this.retter = new ArrayList<Rett>();
    }

    /**
     * Metode for å legge til en ny rett.
     *
     * @param newRett den nye retten vil bli lagt til i menyregisteret
     */
    public void addRett(Rett newRett) {
        this.retter.add(newRett);
    }

    /**
     * Gets for å hente ut rett ved navn.
     *
     * @param navn er navnet på retten
     * @return retten av gitt navn (null hvis det ikke eksisterer)
     */
    public Rett getRettAvNavn(String navn) {
        for (Rett rett : this.retter) {
            if (rett.getNavn().equals(navn)) {
                return rett;
            }
        }

        return null;
    }

    /**
     * Get metode for å hente ut retter av type.
     *
     * @param types er typen av retten
     * @return en liste av retter med gitt/bestemt type
     */
    public ArrayList<Rett> getRetterAvType(String types) {
        ArrayList<Rett> resultList = new ArrayList<Rett>();

        for (Rett rett : this.retter) {
            if(rett.getType().equals(types)) {
                resultList.add(rett);
            }
        }
        return resultList;
    }

    /**
     * Metode for å legge en ny meny til menyregisteret
     *
     * @param newMeny er den nye menyen som vil bli lagt til i menyregisteret
     */
    public void addMeny(Meny newMeny) {
        this.menyer.add(newMeny);
    }

    /**
     * Gets menyer mellom to priser.
     *
     * @param lavestPris laveste prisen
     * @param høyestPris høyeste prisen
     * @return en liste av menyer innenfor gitt prisintervall
     */
    public ArrayList<Meny> getMenyerMellomPriser(double lavestPris, double høyestPris) {
        ArrayList<Meny> resultList = new ArrayList<Meny>();

        for (Meny meny : this.menyer) {
            if (lavestPris <= meny.getMenyPris() && meny.getMenyPris() <= høyestPris) {
                resultList.add(meny);
            }
        }

        return resultList;
    }

}

/**
 * Klassen Arrangement.
 */
public class Arrangement {
    /**
     * Number definert som heltall.
     */
   private int number;
    /**
     * Name som String.
     */
    private String name;
    /**
     * Place som String.
     */
    private String place;
    /**
     * Organizer som String.
     */
    private String organizer;
    /**
     * Type som String.
     */
    private String type;

    /**
     * Time som long.
     */
    private long time;

    /**
     * Constructor for Arrangement.
     *
     * @param name      the name
     * @param number    the number
     * @param place     the place
     * @param organizer the organizer
     * @param type      the type
     * @param time      the time
     */
    public Arrangement(String name, int number, String place, String organizer, String type, long time) {
        this.number = number;
        this.name = name;
        this.place = place;
        this.organizer = organizer;
        this.type = type;
        this.time = time;
    }

    /**
     * Get metode for number.
     *
     * @return number
     */
    public int getNumber() {
        return number;
    }

    /**
     * Get metode for name.
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Get metode for place.
     *
     * @return place
     */
    public String getPlace() {
        return place;
    }

    /**
     * Gets organizer.
     *
     * @return the organizer
     */
    public String getOrganizer() {
        return organizer;
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
     * Gets time.
     *
     * @return the time
     */
    public long getTime() {
        return time;
    }

    public String toString() {
        String arrangementToString = "";
        arrangementToString = arrangementToString.concat("#" + getNumber() + ". ");
        arrangementToString = arrangementToString.concat("Arrangement name: " + getName() + "\n");
        arrangementToString = arrangementToString.concat("Place of the arrangement: " + getPlace() + "\n");
        arrangementToString = arrangementToString.concat("Organizer of the arrangement: " + getOrganizer() + "\n");
        arrangementToString = arrangementToString.concat("Type of arrangement: " + getType() + "\n");
        arrangementToString = arrangementToString.concat("Time of the arrangement: " + getTime() + "\n");

        return arrangementToString;
    }

}
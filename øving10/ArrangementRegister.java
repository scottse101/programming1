import java.util.ArrayList;
import java.util.Collections;

/**
 * Klassen Arrangement register.
 */
public class ArrangementRegister {
    private final ArrayList<Arrangement> arrangements;

    /**
     * Constructor for Arrangement register.
     */
    public ArrangementRegister() {
        this.arrangements = new ArrayList<Arrangement>();
    }

    /**
     * Add arrangement.
     *
     * @param newArrangement new arrangement
     */
    public void addArrangement (Arrangement newArrangement) {
        this.arrangements.add(newArrangement);
    }

    /**
     * Gets place.
     *
     * @param place the place
     * @return the place
     */
    public ArrayList<Arrangement> getPlace(String place) {
        ArrayList<Arrangement> resultList = new ArrayList<>();

        for (Arrangement arrangement : this.arrangements) {
            if (arrangement.getPlace().equals(place)) {
                resultList.add(arrangement);
            }
        }
        return resultList;
    }

    /**
     * Gets arrangements at date.
     *
     * @param date the date
     * @return the arrangements at date
     */
    public ArrayList<Arrangement> getArrangementsAtDate(long date) {
        ArrayList<Arrangement> resultlist = new ArrayList<Arrangement>();

        for (Arrangement arrangement : this.arrangements) {
            if (date == arrangement.getTime()/10000) {
                resultlist.add(arrangement);
            }
        }
        return resultlist;
    }

    /**
     * Gets arrangements between dates.
     *
     * @param firstDate  the first date
     * @param secondDate the second date
     * @return the arrangements between dates
     */
    public ArrayList<Arrangement> getArrangementsBetweenDates(long firstDate, long secondDate) {
        ArrayList<Arrangement> resultlist = new ArrayList<Arrangement>();

        for (Arrangement arrangement : this.arrangements) {
            if (firstDate <= arrangement.getTime()/10000 && arrangement.getTime()/10000 <= secondDate) {
                resultlist.add(arrangement);
            }
        }
        return resultlist;
    }

    /**
     * Gets arrangements by type.
     *
     * @param types the types
     * @return the arrangements by type
     */
    public ArrayList<Arrangement> getArrangementsByType(String types) {
        ArrayList<Arrangement> resultList = new ArrayList<Arrangement>();

        for (Arrangement arrangement : this.arrangements) {
            if(arrangement.getType().equals(types)) {
                resultList.add(arrangement);
            }
        }
        return resultList;
    }

    /**
     * Sort arrangement by place array list.
     *
     * @return the array list
     */
    public ArrayList<Arrangement> sortArrangementByPlace() {
        ArrayList<Arrangement> resultList = new ArrayList<Arrangement>();
        ArrayList<String> places = new ArrayList<String>();

        for (Arrangement arrangement : this.arrangements) {
            if(!places.contains(arrangement.getPlace())) {
                places.add(arrangement.getPlace());
            }
        }
        Collections.sort(places);
        for (String place : places) {
            resultList.addAll(this.getPlace(place));
        }
        return resultList;
    }


    /**
     * Sort arrangement by type array list.
     *
     * @return the array list
     */
    public ArrayList<Arrangement> sortArrangementByType() {
        ArrayList<Arrangement> resultList = new ArrayList<Arrangement>();
        ArrayList<String> types = new ArrayList<String>();

        for (Arrangement arrangement : this.arrangements) {
            if(!types.contains(arrangement.getType())) {
                types.add(arrangement.getType());
            }
        }
        Collections.sort(types);
        for (String type : types) {
            resultList.addAll(this.getArrangementsByType(type));
        }
        return resultList;
    }

    /**
     * Sort arrangement by time array list.
     *
     * @return the array list
     */
    public ArrayList<Arrangement> sortArrangementByTime() {
        ArrayList<Arrangement> resultList = new ArrayList<Arrangement>();
        ArrayList<Long> timeOfArrangement = new ArrayList<Long>();

        for (Arrangement arrangement : this.arrangements) {
            if(!timeOfArrangement.contains(arrangement.getTime())) {
                timeOfArrangement.add(arrangement.getTime());
            }
        }
        Collections.sort(timeOfArrangement);
        for (long time : timeOfArrangement) {
            resultList.addAll(this.getArrangementsAtDate(time/10000));
        }
        return resultList;
    }

    public String toString() {
        String arrangementList = "";
        for (Arrangement arrangement : this.arrangements) {
            arrangementList = arrangementList.concat(arrangement.toString());
            arrangementList = arrangementList.concat("\n");
        }
        return arrangementList;
    }

}




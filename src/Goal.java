/**
 * Created by Theodore Gaebler on 4/5/2017.
 * Goal class is a defined Goal label with
 * a boolean value of having been found or
 * not.
 */
public class Goal {

    private boolean found;
    private String label;

    /**
     * Constructor with defined goal
     * @param label
     */
    public Goal(String label) {
        found = false;
        this.label = label;
    }

    /**
     * Flips boolean value of found when Goal
     * instance is found
     */
    public void setFound() {
        found = true;
    }

    /**
     * Sets the label of Goal instance
     * @param label
     */
    public void setLabel(String label) {
        this.label = label;
    }

    /**
     * Returns boolean value of found
     * @return found
     */
    public boolean getFound() {
        return found;
    }

    /**
     * Returns the String value of label
     * @return
     */
    public String toString(){
        return label;
    }

}

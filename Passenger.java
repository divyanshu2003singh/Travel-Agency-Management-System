import java.util.ArrayList;
import java.util.List;

/**
 * Represents a passenger.
 */
public abstract class Passenger {
    private String name;
    private int passengerNumber;
    private List<Activity> activities;

    /**
     * Constructs a new passenger with the given name and passenger number.
     * @param name The name of the passenger.
     * @param passengerNumber The passenger number.
     */
    public Passenger(String name, int passengerNumber) {
        this.name = name;
        this.passengerNumber = passengerNumber;
        this.activities = new ArrayList<>();
    }

    /**
     * Gets the name of the passenger.
     * @return The name of the passenger.
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the passenger number.
     * @return The passenger number.
     */
    public int getPassengerNumber() {
        return passengerNumber;
    }

    /**
     * Signs up the passenger for an activity.
     * @param activity The activity to sign up for.
     */
    public void signUpForActivity(Activity activity) {
        activities.add(activity);
    }

    /**
     * Gets the list of activities signed up by the passenger.
     * @return The list of activities.
     */
    public List<Activity> getActivities() {
        return activities;
    }
}

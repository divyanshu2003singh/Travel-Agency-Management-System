/**
 * Represents a premium passenger.
 */
public class PremiumPassenger extends Passenger {
    /**
     * Constructs a new premium passenger with the given parameters.
     * @param name The name of the passenger.
     * @param passengerNumber The passenger number.
     */
    public PremiumPassenger(String name, int passengerNumber) {
        super(name, passengerNumber);
    }

    /**
     * Signs up the premium passenger for an activity.
     * @param activity The activity to sign up for.
     */
    @Override
    public void signUpForActivity(Activity activity) {
        if (activity.getCapacity() > 0) {
            activity.reduceCapacity();
        } else {
            System.out.println("Unable to sign up for activity: " + activity.getName());
        }
    }
}

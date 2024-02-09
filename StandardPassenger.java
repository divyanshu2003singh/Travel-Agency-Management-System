/**
 * Represents a standard passenger with a balance.
 */
public class StandardPassenger extends Passenger {
    private double balance;

    /**
     * Constructs a new standard passenger with the given parameters.
     * @param name The name of the passenger.
     * @param passengerNumber The passenger number.
     * @param balance The balance of the passenger.
     */
    public StandardPassenger(String name, int passengerNumber, double balance) {
        super(name, passengerNumber);
        this.balance = balance;
    }

    /**
     * Gets the balance of the standard passenger.
     * @return The balance of the standard passenger.
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Signs up the standard passenger for an activity.
     * @param activity The activity to sign up for.
     */
    @Override
    public void signUpForActivity(Activity activity) {
        if (balance >= activity.getCost() && activity.getCapacity() > 0) {
            balance -= activity.getCost();
            activity.reduceCapacity();
        } else {
            System.out.println("Unable to sign up for activity: " + activity.getName());
        }
    }
}

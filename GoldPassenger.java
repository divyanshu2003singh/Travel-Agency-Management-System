/**
 * Represents a gold passenger with a balance and discount.
 */
public class GoldPassenger extends Passenger {
    private double balance;

    /**
     * Constructs a new gold passenger with the given parameters.
     * @param name The name of the passenger.
     * @param passengerNumber The passenger number.
     * @param balance The balance of the passenger.
     */
    public GoldPassenger(String name, int passengerNumber, double balance) {
        super(name, passengerNumber);
        this.balance = balance;
    }

    /**
     * Gets the balance of the gold passenger.
     * @return The balance of the gold passenger.
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Signs up the gold passenger for an activity.
     * @param activity The activity to sign up for.
     */
    @Override
    public void signUpForActivity(Activity activity) {
        if (balance >= activity.getCost() * 0.9 && activity.getCapacity() > 0) {
            balance -= activity.getCost() * 0.9;
            activity.reduceCapacity();
        } else {
            System.out.println("Unable to sign up for activity: " + activity.getName());
        }
    }
}

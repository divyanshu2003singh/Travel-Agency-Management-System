/**
 * Represents an activity available at a destination.
 */
public class Activity {
    private String name;
    private String description;
    private double cost;
    private int capacity;
    private Destination destination;

    /**
     * Constructs a new activity with the given parameters.
     * @param name The name of the activity.
     * @param description The description of the activity.
     * @param cost The cost of the activity.
     * @param capacity The capacity of the activity.
     */
    public Activity(String name, String description, double cost, int capacity, Destination destination) {
        this.name = name;
        this.description = description;
        this.cost = cost;
        this.capacity = capacity;
        this.destination = destination;
    }

    /**
     * Gets the name of the activity.
     * @return The name of the activity.
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the description of the activity.
     * @return The description of the activity.
     */
    public String getDescription() {
        return description;
    }

    /**
     * Gets the cost of the activity.
     * @return The cost of the activity.
     */
    public double getCost() {
        return cost;
    }

    /**
     * Gets the capacity of the activity.
     * @return The capacity of the activity.
     */
    public int getCapacity() {
        return capacity;
    }

    /**
     * Reduces the capacity of the activity by one.
     */
    public void reduceCapacity() {
        capacity--;
    }

    /**
     * Gets the destination of the activity.
     * @return The destination of the activity.
     */
    public Destination getDestination() {
        return destination;
    }
}

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a destination with a list of activities.
 */
public class Destination {
    private String name;
    private List<Activity> activities;

    /**
     * Constructs a new destination with the given name.
     * @param name The name of the destination.
     */
    public Destination(String name) {
        this.name = name;
        this.activities = new ArrayList<>();
    }

    /**
     * Adds an activity to the destination.
     * @param activity The activity to add.
     */
    public void addActivity(Activity activity) {
        activities.add(activity);
    }

    /**
     * Gets the name of the destination.
     * @return The name of the destination.
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the list of activities in the destination.
     * @return The list of activities.
     */
    public List<Activity> getActivities() {
        return activities;
    }

    /**
     * Prints the activities available in the destination.
     */
    public void printActivities() {
        System.out.println("Destination: " + name);
        for (Activity activity : activities) {
            System.out.println("  Activity: " + activity.getName());
            System.out.println("    Description: " + activity.getDescription());
            System.out.println("    Cost: " + activity.getCost());
            System.out.println("    Capacity: " + activity.getCapacity());
        }
    }

    /**
     * Prints the available activities in the destination.
     */
    public void printAvailableActivities() {
        System.out.println("  Destination: " + name);
        for (Activity activity : activities) {
            if (activity.getCapacity() > 0) {
                System.out.println("    Activity: " + activity.getName());
                System.out.println("      Available Spaces: " + activity.getCapacity());
            }
        }
    }
}

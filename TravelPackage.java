import java.util.ArrayList;
import java.util.List;

/**
 * Represents a travel package with a list of destinations and passengers.
 */
public class TravelPackage {
    private String name;
    private int passengerCapacity;
    private List<Destination> destinations;
    private List<Passenger> passengers;

    /**
     * Constructs a new travel package with the given name and passenger capacity.
     * @param name The name of the travel package.
     * @param passengerCapacity The passenger capacity of the travel package.
     */
    public TravelPackage(String name, int passengerCapacity) {
        this.name = name;
        this.passengerCapacity = passengerCapacity;
        this.destinations = new ArrayList<>();
        this.passengers = new ArrayList<>();
    }

    /**
     * Adds a destination to the travel package.
     * @param destination The destination to add.
     */
    public void addDestination(Destination destination) {
        destinations.add(destination);
    }

    /**
     * Adds a passenger to the travel package.
     * @param passenger The passenger to add.
     */
    public void addPassenger(Passenger passenger) {
        if (passengers.size() < passengerCapacity) {
            passengers.add(passenger);
        } else {
            System.out.println("The travel package is already full. Cannot add more passengers.");
        }
    }

    /**
     * Prints the itinerary of the travel package.
     */
    public void printItinerary() {
        System.out.println("Travel Package: " + name);
        for (Destination destination : destinations) {
            destination.printActivities();
        }
    }

    /**
     * Prints the list of passengers in the travel package.
     */
    public void printPassengerList() {
        System.out.println("Travel Package: " + name);
        System.out.println("Passenger Capacity: " + passengerCapacity);
        System.out.println("Number of Passengers: " + passengers.size());
        for (Passenger passenger : passengers) {
            System.out.println("  Name: " + passenger.getName());
            System.out.println("  Passenger Number: " + passenger.getPassengerNumber());
        }
    }

    /**
     * Prints the details of an individual passenger.
     * @param passenger The passenger to print details for.
     */
    public void printPassengerDetails(Passenger passenger) {
        System.out.println("Passenger Details:");
        System.out.println("  Name: " + passenger.getName());
        System.out.println("  Passenger Number: " + passenger.getPassengerNumber());
        if (passenger instanceof StandardPassenger) {
            System.out.println("  Passenger Type: Standard");
            System.out.println("  Balance: " + ((StandardPassenger) passenger).getBalance());
        } else if (passenger instanceof GoldPassenger) {
            System.out.println("  Passenger Type: Gold");
            System.out.println("  Balance: " + ((GoldPassenger) passenger).getBalance());
        } else if (passenger instanceof PremiumPassenger) {
            System.out.println("  Passenger Type: Premium");
        }
        System.out.println("  Activities:");
        for (Activity activity : passenger.getActivities()) {
            System.out.println("    - " + activity.getName() + " at " + activity.getDestination().getName() +
                    " (Cost: " + activity.getCost() + ")");
        }
    }

    /**
     * Prints the details of available activities in the travel package.
     */
    public void printAvailableActivities() {
        System.out.println("Available Activities:");
        for (Destination destination : destinations) {
            destination.printAvailableActivities();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // Create a travel package
        TravelPackage package1 = new TravelPackage("Summer Vacation", 20);

        // Create destinations
        Destination destination1 = new Destination("Beach Resort");
        Destination destination2 = new Destination("Mountain Retreat");

        // Create activities
        Activity activity1 = new Activity("Scuba Diving", "Explore underwater life", 50.0, 10, destination1);
        Activity activity2 = new Activity("Hiking", "Enjoy the scenic views", 20.0, 15, destination2);
        Activity activity3 = new Activity("Spa Treatment", "Relax and rejuvenate", 80.0, 5, destination1);

        // Add activities to destinations
        destination1.addActivity(activity1);
        destination1.addActivity(activity3);
        destination2.addActivity(activity2);

        // Add destinations to the travel package
        package1.addDestination(destination1);
        package1.addDestination(destination2);

        // Print itinerary
        package1.printItinerary();

        // Create passengers
        StandardPassenger passenger1 = new StandardPassenger("John", 1, 200.0);
        GoldPassenger passenger2 = new GoldPassenger("Alice", 2, 500.0);
        PremiumPassenger passenger3 = new PremiumPassenger("Bob", 3);

        // Add passengers to the travel package
        package1.addPassenger(passenger1);
        package1.addPassenger(passenger2);
        package1.addPassenger(passenger3);

        // Passengers sign up for activities
        passenger1.signUpForActivity(activity1);
        passenger2.signUpForActivity(activity2);
        passenger3.signUpForActivity(activity3);

        // Print passenger list
        package1.printPassengerList();

        // Print available activities
        package1.printAvailableActivities();
    }
}

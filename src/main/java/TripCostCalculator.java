import java.util.Scanner;

public class TripCostCalculator {

    public static double calculateTripCost(double kilometers, double fuelCost, double fuelConsumption) {
        return (kilometers / 100) * fuelConsumption * fuelCost;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the distance of the trip in kilometers: ");
        double kilometers = input.nextDouble();

        System.out.print("Enter the cost of fuel per liter: ");
        double fuelCost = input.nextDouble();

        double fuelConsumption = 5.0;

        double tripCost = calculateTripCost(kilometers, fuelCost, fuelConsumption);

        System.out.println("The cost of the trip is: " + tripCost);
    }
}

public class Bicycle extends Vehicle {

    private int gears;
    private boolean isMountainBike;

    public Bicycle(String brand, int year, int gears, boolean isMountainBike) {

        super(brand, year);
        this.gears = gears;
        this.isMountainBike = isMountainBike;

    }
    public int getGears() {
        return this.gears;

    }
    public String getType() {
        if (isMountainBike) {

            return "Mountain Bike";

        } else {

            return "Road Bike";

        }

    }
    @Override
    public void displayInfo() {

        super.displayInfo();
        System.out.println("Gears: " + gears);
        System.out.println("Type: " + getType());

    }

}
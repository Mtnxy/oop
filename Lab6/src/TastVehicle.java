public class TastVehicle {
    public static void main(String[] args) {

        Car myCar = new Car("Toyota", 2020, 4);
        Bicycle myBicycle = new Bicycle("Giant", 2021, 10, true);

        myCar.displayInfo();
        System.out.println();

        myBicycle.displayInfo();

    }

}


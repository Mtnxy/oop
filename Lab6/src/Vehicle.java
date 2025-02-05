public class Vehicle {
    private String brand;
        private int year;

        public Vehicle(String brand, int year) {
            this.brand = brand;
            this.year = year;

        }

        public void displayInfo() {
            System.out.println("Brand: " + brand + ", Year: " + year);

        }


}

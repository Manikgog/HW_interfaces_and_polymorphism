public class Main {
    public static void main(String[] args) {
        Vehicle[] arrVehicles = new Vehicle[]{
            new Car("car1", 4),
            new Car("car", 4),
            new Truck("truck", 4),
            new Truck("truck2", 4),
            new Bicycle("bicycle", 2),
            new Bicycle("bicycle2", 2),
        };

        for (Vehicle v : arrVehicles) {
            System.out.println("**************************************");
            v.check();
        }
    }
}
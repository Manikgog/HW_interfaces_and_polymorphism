public class Main {
    public static void main(String[] args) {
        Transport[] arrTransports = new Transport[]{
            new Car("car1", 4),
            new Car("car", 4),
            new Truck("truck", 4),
            new Truck("truck2", 4),
            new Bicycle("bicycle", 2),
            new Bicycle("bicycle2", 2),
        };
        ServiceStation serviceStation = new ServiceStation();
        for (Transport t : arrTransports) {
            System.out.println("**************************************");
            serviceStation.check(t);
        }
    }
}
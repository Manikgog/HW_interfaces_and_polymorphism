public interface ServiceStation {
    default void updateTyre(Vehicle vehicle){
        for (int i = 0; i < vehicle.getWheelsCount(); i++) {
            System.out.println("Меняем покрышку");
        }
    }
    void check(Vehicle vehicle);
}

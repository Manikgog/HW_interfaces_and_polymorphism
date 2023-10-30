public class Car extends Vehicle {
    public Car(){}
    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override public void check(){
        ServiceStation serviceStation = new ServiceStationForCars();
        serviceStation.check(this);
    }
}
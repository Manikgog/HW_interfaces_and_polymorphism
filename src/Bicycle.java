public class Bicycle extends Vehicle {
    public Bicycle() {}
    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override public void check(){
        ServiceStation serviceStation = new ServiceStationForBicycles();
        serviceStation.check(this);
    }
}
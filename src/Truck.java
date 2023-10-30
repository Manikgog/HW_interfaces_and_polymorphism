public class Truck extends Vehicle {
    public Truck(){}
    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override public void check(){
        ServiceStation serviceStation = new ServiceStationForTrucks();
        serviceStation.check(this);
    }
}
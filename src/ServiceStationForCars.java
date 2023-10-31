public class ServiceStationForCars implements ServiceStationForAuto {

    @Override public void check(Vehicle car){
        System.out.println("Обслуживаем " + car.getModelName());
        updateTyre(car);
        checkEngine();
    }
}

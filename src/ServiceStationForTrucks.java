public class ServiceStationForTrucks implements ServiceStationForAuto{

    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }

    @Override public void check(Vehicle truck){
        System.out.println("Обслуживаем " + truck.getModelName());
        updateTyre(truck);
        checkEngine();
        checkTrailer();
    }
}

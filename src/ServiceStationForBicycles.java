public class ServiceStationForBicycles implements ServiceStation{
    @Override public void check(Vehicle bycicle){
        System.out.println("Обслуживаем " + bycicle.getModelName());
        updateTyre(bycicle);
    }
}

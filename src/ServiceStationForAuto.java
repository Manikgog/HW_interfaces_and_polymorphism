public interface ServiceStationForAuto extends ServiceStation{
    default public void checkEngine(){
        System.out.println("Проверяем двигатель");
    }
}

public class Truck extends Transport {
    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void service() {
        super.service();
        System.out.println("Проверяем двигатель");
        System.out.println("Проверяем прицеп");
    }
}

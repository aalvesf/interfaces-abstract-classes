public class Road extends Environment<Drivable> {

    public Road(int maxSpeed) {
        super(70);
    }

    @Override
    public void checkTraffic() {
        for (Drivable item : traffic) {
            item.drive();
        }
    }

    public void checkVehicles() {
        for (Drivable item : traffic) {
            if (item instanceof Vehicle) {
                ((Vehicle) item).move();
            }
        }
    }
}

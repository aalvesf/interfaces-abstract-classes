public class Sky extends Environment<Flyable> {

    public Sky(int maxSpeed) {
        super(800);
    }

    @Override
    public void checkTraffic() {
        for (Flyable item : traffic) {
            item.fly();
        }
    }
    public void checkVehicles() {
        for (Flyable item : traffic) {
            if(item instanceof Vehicle) {
                ((Vehicle) item).move();
            }
        }
    }

}
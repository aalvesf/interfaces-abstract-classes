public class Water extends Environment<Swimmable> {

    public Water(int maxSpeed) {
        super(20);
    }

    @Override
    public void checkTraffic() {
        for (Swimmable item : traffic) {
            item.swim();
        }
    }

    @Override
    public void checkVehicles() {
        for (Swimmable item : traffic) {
            if(item instanceof Vehicle) {
                ((Vehicle) item).move();
            }
        }
    }
}




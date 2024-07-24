public class Van extends Vehicle implements Drivable{
    int speed;

    @Override
    public void move() {
        drive();
    }


    @Override
    public double getSpeed() {
        return 0;
    }

    @Override
    public Position getPosition() {
        return null;
    }

    @Override
    public Direction getDirection() {
        return null;
    }

    @Override
    public void setSpeed(int maxSpeed) {

    }
}

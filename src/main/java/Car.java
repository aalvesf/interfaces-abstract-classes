public class Car extends Vehicle implements Drivable {
    int speed;
    Position position;
    Direction direction;

    public Car() {
        this.speed = 70;
        this.position = new Position(0,0);
        this.direction = Direction.NORTH;
    }
    @Override
    public void move() {
//        drive();
        System.out.println("Car is being driven at " + speed + "mph.");
    }

    @Override
    public double getSpeed() {
        return speed;
    }

    @Override
    public Position getPosition() {
        return position;
    }

    @Override
    public Direction getDirection() {
        return direction;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }
    }

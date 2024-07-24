public class Duck extends Bird implements Swimmable, Movable {
    int speed;
    Position position;
    Direction direction;

    public Duck() {
        this.speed = 5;
        this.position = new Position(0,0);
        this.direction = Direction.WEST;
    }

    @Override
    public void makeSound() {
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

    @Override
    public void swim() {
        Swimmable.super.swim();
        System.out.println("Duck is swimming at " + speed + "mph.");
    }
}

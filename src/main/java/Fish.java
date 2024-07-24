public class Fish extends Animal implements Swimmable {
    int speed = 10;
    @Override
    public void swim() {
        Swimmable.super.swim();
    }
    @Override
    public void makeSound() {

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

public interface Movable {
    double getSpeed();

    Position getPosition();

    Direction getDirection();

    void setSpeed(int maxSpeed);
}

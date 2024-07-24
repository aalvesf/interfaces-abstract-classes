import java.util.ArrayList;
import java.util.List;

public abstract class Environment<T extends Movable> {

    protected List<T> traffic = new ArrayList<>();

    public int maxSpeed;
    public Environment(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public abstract void checkTraffic();

    public void addTraffic(T traffic) {
        this.traffic.add(traffic);
    }

    public void checkVehicles(){
    }

    public void maximumSpeedLimit(){
        for( T t : traffic) {
            if (t.getSpeed() > maxSpeed) {
                t.setSpeed(maxSpeed);
            }
        }
    }
public double getMaxSpeed() {
        return maxSpeed;
}

}






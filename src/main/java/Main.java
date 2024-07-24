import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Object> objects = List.of(
                new Aeroplane(),
                new Car(),
                new Pigeon(),
                new Duck(),
                new Fish()
        );

//        for (Object object : objects) {
//
//            if (object instanceof Swimmable swimmable && !(object instanceof Flyable flyable)) {
//                swimmable.swim(); // fish
//            } else if (object instanceof Swimmable swimmable) {
//                System.out.println(object.getClass().getSimpleName() + " is flying and swimming!"); //duck
//            } else if (object instanceof Flyable flyable) {
//                flyable.fly(); // pigeon, aeroplane
//            } else if (object instanceof Vehicle vehicle) {
//                vehicle.move(); // car
//            }
//
//        }

        Sky sky = new Sky(900);
        sky.addTraffic(new Duck());
        sky.addTraffic(new Pigeon());
        sky.addTraffic(new Aeroplane());

        sky.checkTraffic();

        Water water = new Water(15);
        water.addTraffic(new Duck());
        water.addTraffic(new Fish());

        Road road = new Road(70);
        road.addTraffic(new Car());
        road.addTraffic(new Van());
        road.addTraffic(new Lorry());

        List<Environment<?>> environments = List.of(sky, water, road);

        for (Environment<?> environment: environments) {
//            environment.checkTraffic();
            environment.checkVehicles();
        }

    }

}


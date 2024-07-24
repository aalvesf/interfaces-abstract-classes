import java.util.List;

public class Main {
    public static void main(String[] args) {

//        List<Object> objects = List.of(
//                new Aeroplane(),
//                new Car(),
//                new Pigeon(),
//                new Duck(),
//                new Fish()
//        );
//
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

        Sky sky = new Sky();
        sky.addTraffic(new Duck());
        sky.addTraffic(new Pigeon());
        sky.addTraffic(new Aeroplane());

        sky.checkTraffic();

    }


}


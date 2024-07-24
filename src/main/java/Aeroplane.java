public class Aeroplane extends Vehicle implements Flyable, Drivable {
    @Override
    public void move() {
        fly();
    }
}

//    @Override
////    public void fly() {
////        Flyable.super.fly();
////    }
////}

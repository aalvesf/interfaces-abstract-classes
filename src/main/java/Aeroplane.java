public class Aeroplane extends Vehicle implements Flyable {
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

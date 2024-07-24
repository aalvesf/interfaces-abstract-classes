public interface Drivable extends Movable {
   default void drive() {
        System.out.println(this.getClass().getSimpleName() + " is being driven!");
    }
}

public class Road extends Environment<Drivable>{
    @Override
    public void checkTraffic() {
        for (Drivable item : traffic) {
            item.drive();
        }
    }
}

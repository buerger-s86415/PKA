
public class UGV implements Vehicle {
    private final String id;
    private Position currentPosition;
    private double batteryLevel;
    private String state;

    public UGV(String id, Position position, double batteryLevel, String state) {
        this.id = id;
        this.currentPosition = position;
        this.batteryLevel = batteryLevel;
        this.state = state;
    }

    public String getId() {
        return id;
    }

    public Position getCurrentPosition() {
        return currentPosition;
    }

    @Override
    public void assignTask(Task task) {

    }
    public void setCurrentPosition(Position currentPosition) {
        this.currentPosition = currentPosition;
    }

    public double getBatteryLevel() {
        return batteryLevel;
    }

    public void setBatteryLevel(double batteryLevel) {
        this.batteryLevel = batteryLevel;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}

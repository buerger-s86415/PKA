import java.util.ArrayList;
import java.util.List;

public class UGV implements Vehicle {
    private final String id;
    private Position currentPosition;
    private double batteryLevel;
    private List<Task> tasks = new ArrayList<>();

    public UGV(String id, Position position, double batteryLevel) {
        this.id = id;
        this.currentPosition = position;
        this.batteryLevel = batteryLevel;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public Position getCurrentPosition() {
        return currentPosition;
    }

    @Override
    public void assignTask(Task task) {
        tasks.add(task);
    }

    public double getBatteryLevel() {
        return batteryLevel;
    }
}

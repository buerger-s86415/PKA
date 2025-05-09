import java.util.List;

public class Task {
    private final String taskId;
    private String description;
    private String state;
    private final String priority;
    private Route route;

    public Task(String taskId, Route route, String description, String state, String priority) {
        this.taskId = taskId;
        this.description = description;
        this.state = state;
        this.priority = priority;
        this.route = route;
    }

    public String getTaskId() {
        return taskId;
    }

    public void setRoute(Route route) {
        this.route = route;
    }

    public Route getRoute() {
        return this.route;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public String getPriority() {
        return priority;
    }
}

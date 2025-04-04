import java.util.List;

public class Task {
    private final String taskId;
    private final List<Route> routes;

    public Task(String taskId, List<Route> routes) {
        this.taskId = taskId;
        this.routes = routes;
    }

    public String getTaskId() {
        return taskId;
    }

    public List<Route> getRoutes() {
        return routes;
    }
}

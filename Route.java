import java.util.List;

public class Route {
    private final String routeId;
    private final List<Position> waypoints;

    public Route(String routeId, List<Position> waypoints) {
        this.routeId = routeId;
        this.waypoints = waypoints;
    }

    public String getRouteId() {
        return routeId;
    }

    public List<Position> getWaypoints() {
        return waypoints;
    }
}

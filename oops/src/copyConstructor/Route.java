package copyConstructor;

public class Route {

    int routeId;
    String source;
    String destination;

    public Route(int routeId, String source, String destination) {
        this.routeId = routeId;
        this.source = source;
        this.destination = destination;
    }

    public Route(Route other) {
        this.routeId = other.routeId;
        this.source = other.source;
        this.destination = other.destination;
    }
}

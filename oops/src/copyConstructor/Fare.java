package copyConstructor;

import javax.print.attribute.standard.OrientationRequested;
import java.awt.*;

public class Fare {

    int fareId;
    double amount;
    Route route;

    public Fare(int fareId, double amount, Route route) {
        this.fareId = fareId;
        this.amount = amount;
        this.route = route;
    }

    public Fare(Fare other) {
        this.fareId = other.fareId;
        this.amount = other.amount;
        this.route = new Route(other.route);
    }
}

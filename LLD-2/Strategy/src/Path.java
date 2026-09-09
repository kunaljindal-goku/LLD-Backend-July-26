public class Path {

    private int dist;
    private double etaInHours;

    public Path(int dist, double etaInHours) {
        this.dist = dist;
        this.etaInHours = etaInHours;
    }

    public int getDist() {
        return dist;
    }

    public void setDist(int dist) {
        this.dist = dist;
    }

    public double getEtaInHours() {
        return etaInHours;
    }

    public void setEtaInHours(double etaInHours) {
        this.etaInHours = etaInHours;
    }

    @Override
    public String toString() {
        return "Path{" +
                "dist=" + dist +
                ", etaInHours=" + etaInHours +
                '}';
    }
}

public class WalkPathCalculator implements PathCalculator{
    @Override
    public Path calculate(String source, String dest) {
        System.out.println("Travelling via WALK");
        return new Path(6,4.5);
    }
}

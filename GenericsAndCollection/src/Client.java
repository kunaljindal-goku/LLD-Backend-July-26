public class Client {

    public static void main(String[] args) {
//
//        ObjectPair p = new ObjectPair(); // x,y
//
//        p.setX("abc");
//        p.setY(20);
//
//        int x = (int) p.getX();

        Pair<String,Double> p1 = new Pair<>();
        Pair<Integer,Double> p2 = new Pair<>();
        p1.setX("ABC");
        p1.setY(23.0);

//        Pair<String,Double> p2 = new Pair();

        Pair.doSomething("Kunal");

        System.out.println(p1.getX());
        System.out.println(p1.getY());

    }
}

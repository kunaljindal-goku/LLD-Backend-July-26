import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ClientDragonBall {

    public static void main(String[] args) {
        Sayan goku = new Sayan(1,"Goku");
        Sayan vegeta = new Sayan(1,"Vegeta");

        Map<Sayan, List<String>> sayanMoves = new HashMap<>();

        sayanMoves.put(goku,List.of("Kamameha","Spirit Bomb"));
//
//        System.out.println(goku==vegeta);
//        System.out.println(goku.equals(vegeta));

        System.out.println(sayanMoves.get(vegeta));
    }
}

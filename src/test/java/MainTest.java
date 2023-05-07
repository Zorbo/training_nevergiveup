import java.util.List;
import org.example.Train;
import org.junit.jupiter.api.Test;

public class MainTest {

    List<List<Integer>> input = List.of(List.of(0,0,0), List.of(0,0,0), List.of(0,0,0));
    private List<List<String>> input2 = List.of(List.of("O", "X", "O"), List.of("X", "X", "O"), List.of("X", "O", "O"));


    @Test
    public void testTicTac() {
        Train train = new Train();

        System.out.println(train.ticTacToeAdvanced(input2));




    }
}

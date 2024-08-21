import java.util.ArrayList;
import java.util.Arrays;

public class BigMass {

    public static void main(String[] args) {
        ArrayList<Integer> mass = new ArrayList<>();
        for (int i = 0; i < 1000000; i++) {
            mass.add((int) (Math.random() * 1000000));
        }

        new InsertionAlgorithm(mass);
        new BubbleAlgorithm(mass);
        new Marraysort(mass);
//         Arrays.sort(mass.toArray(new Integer[mass.size()]));

    }

}
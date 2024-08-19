import java.util.ArrayList;

public class BigMass {


    public static void main(String[] args) {
        ArrayList<Integer> mass = new ArrayList<>();
        for (int i = 0; i < 10000; i++) {
            mass.add((int) (Math.random() * 10000));
        }

        new InsertionAlgorithm(mass);

        new BubbleAlgorithm(mass);

    }

}
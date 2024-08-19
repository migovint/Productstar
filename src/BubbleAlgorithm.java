import java.util.ArrayList;

public class BubbleAlgorithm {
    private ArrayList<Integer> bigMass;

    public BubbleAlgorithm(ArrayList<Integer> bigMass) {
        Stopwatch sw = new Stopwatch();

        this.bigMass = bigMass;

        for (int i = 0; i < bigMass.size(); i++) {
            for (int j = 1; j < bigMass.size() - i; j++) {
                if (bigMass.get(j - 1) > bigMass.get(j)) {
                    int temp = bigMass.get(j - 1);
                    bigMass.set(j - 1, bigMass.get(j));
                    bigMass.set(j, temp);
                }
            }
        }
        System.out.println(bigMass);
        System.out.println("Пузырьком Прошедшее время: " + sw.elapsedMillis() + "мс");

    }

}










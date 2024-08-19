import java.util.ArrayList;

public class InsertionAlgorithm {
    private ArrayList<Integer> bigMass;

    public InsertionAlgorithm(ArrayList<Integer> bigMass) {
        Stopwatch sw = new Stopwatch();
        this.bigMass = bigMass;

        for (int i = 0; i < bigMass.size() - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < bigMass.size(); j++) {
                if (bigMass.get(j) < bigMass.get(minIndex)) {
                    minIndex = j;
                }
            }

            if (i != minIndex) {
                int temp = bigMass.get(i);
                bigMass.set(i, bigMass.get(minIndex));
                bigMass.set(minIndex, temp);
            }
        }
        System.out.println(bigMass);

        System.out.println("Выбором Прошедшее время: " + sw.elapsedMillis() + "мс");
    }

}



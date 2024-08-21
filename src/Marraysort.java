import java.util.ArrayList;
import java.util.Arrays;

public class Marraysort {


    private ArrayList<Integer> bigMass;

    public Marraysort(ArrayList<Integer> mass) {
        Stopwatch sw = new Stopwatch();

        this.bigMass = bigMass;

        Arrays.sort(mass.toArray(new Integer[mass.size()]));



        System.out.println("FHF Прошедшее время: " + sw.elapsedMillis() + "мс");
//        System.out.println(mass);
    }


}


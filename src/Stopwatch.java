public class Stopwatch {
    private long start = System.nanoTime();

    public long elapsedMillis() {
        return ((System.nanoTime() - start) /1000000);
    }

}

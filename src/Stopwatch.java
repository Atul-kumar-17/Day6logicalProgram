public class Stopwatch {
    public static void main(String[] args) {
    long start = System.currentTimeMillis();
        System.out.println("Start stopWatch  = " +start);
    long stop = System.currentTimeMillis();
        System.out.println("Stop = " +stop);
    double elapse= (stop-start);
        System.out.println("elapsed time = " +elapse);
    }
}

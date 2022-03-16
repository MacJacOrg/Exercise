public class Exercise12 {
    public static void main(String[] args) {
        double cal, metr;
        int counter;

        counter = 0;
        for (cal = 1; cal < 13; cal++) {
            ;
            metr = cal * 39.37;

            System.out.println(cal + " to " + metr + " metrów");

            counter++;
            if (counter == 10) {
                System.out.println();
                counter = 0;
            }
        }
    }
}

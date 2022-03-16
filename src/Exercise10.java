public class Exercise10 {
    public static void main(String[] args) {
        double gallons, liters;
        int counter;

        counter = 0;
        for(gallons = 1; gallons < 101; gallons++){
            liters = gallons * 3.7854;
            System.out.println(gallons + " galonów to " + liters + " litrów.");

            counter++;
            if (counter == 10){
                System.out.println();
                counter = 0;
            }
        }
    }
}

import java.util.Random;

public class RainfallMonitor {
    public static void main(String[] args) {
        Random random = new Random();
        double[] rainfall = new double[30];
        double total = 0;
        int wetDays = 0;

        for (int day = 0; day < rainfall.length; day++) {
            rainfall[day] = random.nextDouble() * 60;
            total += rainfall[day];

            if (rainfall[day] > 30) {
                wetDays++;
            }
            System.out.printf("Day %2d: %.2f mm%n", day + 1, rainfall[day]);
        }

        double average = total / rainfall.length;
        System.out.printf("%nTotal monthly rainfall: %.2f mm%n", total);
        System.out.printf("Average daily rainfall: %.2f mm%n", average);
        System.out.println("Number of wet days (>30mm): " + wetDays);

        String classification;
        if (total <= 300) {
            classification = "Dry";
        } else if (total <= 600) {
            classification = "Normal";
        } else {
            classification = "Flood-risk";
        }
        System.out.println("Month classification: " + classification);
    }
}

public class Assignment01Q02 {
    public static void main(String[] args) {
        int numberOfSummands = Integer.parseInt(args[0]);

        double actualPi = Math.PI;
        double approxPi = 0;

        /////////////////////////////////////////////
        // Approximate pi using the Leibniz series.
        /////////////////////////////////////////////
        double sum = 0.0;
        for (int k = 0; k < numberOfSummands; k++) {
            double sign = (k % 2 == 0) ? 1.0 : -1.0;
            double denominator = 2.0 * k + 1.0;
            sum += sign / denominator;
        }
        approxPi = 4.0 * sum;
        /////////////////////////////////////////////

        System.out.println(approxPi + " " + actualPi);
    }
}

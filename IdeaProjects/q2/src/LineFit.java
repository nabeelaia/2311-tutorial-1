public class LineFit {
    private double[] x;
    private double[] y;
    private double slope;
    private double yIntercept;

    public LineFit(double[] x, double[] y) {
        this.x = x;
        this.y = y;
        calculateLineFit();
    }

    private void calculateLineFit() {
        double meanX = calculateMean(x);
        double meanY = calculateMean(y);

        double numerator = 0;
        double denominator = 0;
        for (int i = 0; i < x.length; i++) {
            double xDiff = x[i] - meanX;
            numerator += xDiff * (y[i] - meanY);
            denominator += xDiff * xDiff;
        }

        slope = numerator / denominator;
        yIntercept = meanY - slope * meanX;
    }

    private double calculateMean(double[] values) {
        double sum = 0;
        for (double value : values) {
            sum += value;
        }
        return sum / values.length;
    }

    public double getSlope() {
        return slope;
    }

    public double getYIntercept() {
        return yIntercept;
    }

    public String slope() {
        return null;
    }
}

import java.util.Arrays;

public class linInterp
{
    public linInterp(double[] x, double[] y, double x1) {
    }

        public static double linInterp(double[] x, double[] y, double X) {
            double minX = Arrays.stream(x).min().getAsDouble();
            double maxX = Arrays.stream(x).max().getAsDouble();
            if (X < minX || X > maxX) {
                return Double.NaN;
            }

            int index = Arrays.binarySearch(x, X);
            if (index >= 0) {
                return y[index];
            }

            index = -(index + 1);
            if (index == 0) {
                return y[0];
            } else if (index == x.length) {
                return y[x.length - 1];
            } else {
                double x0 = x[index - 1];
                double x1 = x[index];
                double y0 = y[index - 1];
                double y1 = y[index];
                return (X - x0) * (y1 - y0) / (x1 - x0) + y0;
            }
        }}

public class MainClass {
    public static void main(String[] args) {
        double[] X = {1.19, 2.39, 3.89, 4.78, 5.36, 6.58, 7.46, 8.07, 10.77, 11.27};
        double[] Y = {0.97, 0.434, -0.68, -0.98, -0.76, 0.29, 0.86, 0.68, -0.14, -0.56};
        LineFit myLine = new LineFit(X, Y);
        System.out.println("The equation of line of best fit is: Y=" + myLine.slope() + "X+" + myLine.getYIntercept());
    }
}